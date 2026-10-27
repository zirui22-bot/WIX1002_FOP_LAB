/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop.lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author RUI
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit: ");
        double fah = sc.nextDouble();
        double cel = (fah-32)/1.8;
        
       System.out.printf(" The temperature in degree Fahrenheit is %.2f" , fah );
          System.out.printf(" \nThe temperature in degree celsius is %.2f" , cel );
    }
    
}
