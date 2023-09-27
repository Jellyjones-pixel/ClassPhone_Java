/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classphone;

/**
 *
 * @author jelly_joneske
 */
import java.util.Scanner;
public class ClassPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String testMan;
        String testMod;
        double testPrice;
        
        Scanner keyboard = new Scanner(System.in);
        ClassPhone phone = new ClassPhone();
        System.out.println("Enter the manufacturer: ");
        testMan = keyboard.nextLine();
        System.out.println("Enter the model number: ");
        testMod = keyboard.nextLine();
        System.out.println("Enter the retail price: ");
        testPrice = keyboard.nextDouble();
        
         System.out.println();
          System.out.println("Here is the data that you provided: ");
           System.out.println("Manufacturer:" +phone.getManufact());
    }

    private String getManufact() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
