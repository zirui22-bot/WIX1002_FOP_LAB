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
public class Q6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter radius: ");
            int radius = in.nextInt();
            System.out.println("Enter x coordinate: ");
            int x = in.nextInt();
            System.out.println("Enter y coordinate: ");
            int y = in.nextInt();
        
             if ((x < radius && x > -radius) && (y < radius && y > -radius)) {
            System.out.println("Point is inside");
            } else {
                System.out.println("Point is outside");
        }
    }
        
}
