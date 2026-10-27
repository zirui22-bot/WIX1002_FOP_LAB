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
public class Q2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Price of the car?");
            double P = in.nextDouble();
            System.out.println("Down payment");
            double D = in.nextDouble();
            System.out.println("Interest rate in %");
            double R = in.nextDouble();
            System.out.println("Loan duration in years");
            double Y = in.nextDouble();
            
            
            if (P < 0|| D < 0 || D > P || R < 0 || Y <= 0) {
                System.out.println("Invalid input,");
            }else {
                double M = (P-D) * (1+R*Y/100) / (Y*12);
            System.out.printf("The monthly payment is %.2f", M);
            }
                        in.close();
            }
        }
    
