/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg3;

/**
 *
 * @author RUI
 */

import java.util.Random;

public class Q2 {
        public static void main(String[] args) {
            
        Random r = new Random();
        int num = r.nextInt(0,5+1);
        String word="";
        
        switch (num) {
            case 0:
                word = "Zero";
                break;
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            default:
                break;
        }
        
        System.out.println(num + " is " + word);
    }
    
}
