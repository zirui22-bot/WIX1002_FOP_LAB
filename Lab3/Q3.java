/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg3;

import java.util.Scanner;

/**
 *
 * @author RUI
 */
public class Q3 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total sales: ");
        double sales = in.nextDouble();
        double commission = 0;
        
        if (sales <= 100) {
            commission = 0.05;
        } else if (sales <= 500) {
            commission = 0.075;
        } else if (sales <= 1000) {
            commission = 0.1;
        } else {
            commission = 0.125;
        }
        
        System.out.printf("Total commission is: %.2f%n", sales*commission);
    }
    
}
