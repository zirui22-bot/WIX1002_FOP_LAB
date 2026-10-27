/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author RUI
 */
public class Q6 {
        public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        int M = in.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double iT = in.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double fT = in.nextDouble();
        
        M = M/1000;
        double IT = (iT - 32)/1.8;
        double FT = (fT - 32)/1.8;
        
        
        double Q = M * (FT - IT) * 4184;
        
        System.out.println("The energy needed is " + Q);
        System.out.printf("The energy needed is %.6e" , Q);
    
    }
    
    
}
