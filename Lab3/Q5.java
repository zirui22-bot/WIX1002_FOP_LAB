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
public class Q5 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter value of a:");
        double a = in.nextDouble();
        System.out.println("Enter value of b:");
        double b = in.nextDouble();
        System.out.println("Enter value of c:");
        double c = in.nextDouble();
        System.out.println("Enter value of d:");
        double d = in.nextDouble();
        System.out.println("Enter value of e:");
        double e = in.nextDouble();
        System.out.println("Enter value of f:");
        double f = in.nextDouble();
        
        in.close();
        
        double deno = a*d-b*c;
        
        if (deno == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e*d-b*f)/deno;            
            double y = (a*f-e*c)/deno;

            System.out.printf("x is %.2f%n", x);            
            System.out.printf("y is %.2f%n", y);
        }
    }
        
}
