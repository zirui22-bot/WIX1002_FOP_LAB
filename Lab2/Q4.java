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
public class Q4 {
       public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        int seconds = in.nextInt();
        
        int hours = seconds/3600;
        int remaining_seconds = seconds % 3600;
        int minutes = remaining_seconds / 60;
        int newseconds = remaining_seconds % 60;
        
        System.out.println(seconds + " seconds is " + hours + " hours , " + minutes + " minutes and " + newseconds + " seconds ");
   
        
	       }

    
}
