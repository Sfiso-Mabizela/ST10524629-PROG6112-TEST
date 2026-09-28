/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yearlyelectronicsales;

/**
 *
 * @author Sfiso
 */
public class YearlyElectronicSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int total = 0;
        int highestTotal = 0; 
        int highestindex = 0;
        
        
        String line = "-----------------------------------------------------";
    String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
    
    int[][] consolePrice = {
        {1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}
    };
    
    
     System.out.println(line);
     System.out.println("GAMING CONSOLE REPORT");
     System.out.println(line + "\n");
    
   
    System.out.printf("%-10s %-12s %-15s %10s%n", "", "PS5", "XBOX", "SWITCH");

    
    for(int r = 0; r < cities.length; r++){
        
       int PS5 = consolePrice[r][0];
       int XBOX = consolePrice[r][1];
       int SWITCH = consolePrice[r][2];
    
    System.out.printf("%-10s %-12d %-15d %10d%n", cities[r], PS5, XBOX, SWITCH);
    
    total = PS5 + XBOX + SWITCH;
    
    if(total > highestTotal){
        highestTotal = total;
        highestindex = r;
                }
    
    
    }
    
    System.out.println(line);
     System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
     System.out.println(line);
    
     for(int i = 0; i < cities.length; i++){
     System.out.println(cities[i] + " " +total);
    
     }
     
     System.out.println("\nCITY WITH THE MOST SALES:" + cities[highestindex]);
       System.out.println(line);
     
    }
    

    
    }
