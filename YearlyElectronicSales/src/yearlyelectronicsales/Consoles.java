/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yearlyelectronicsales;

/**
 *
 * @author Sfiso
 */
public abstract class Consoles implements IConsole {
    String storeName;
    String deviceType;
    int TotalAmountSales;

Consoles(String Store, String ConsoleType  ,int TotalSales ){
    this.storeName = Store;
    this.deviceType = ConsoleType;
    this.TotalAmountSales = TotalSales;
}

void consoleType(){
     System.out.println("Select console type" );
     System.out.println("1) PS5" );
     System.out.println("2) XBOX" );
     System.out.println("30 SWITCH" );
}

void storeName(){
    System.out.print("Enter store name:" + Store );
}

void AmountOfSales(){
    System.out.print("Enter total sales:" + TotalSales );
}





}
