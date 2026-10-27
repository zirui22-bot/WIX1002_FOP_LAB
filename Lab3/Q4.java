/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg3;

import java.util.Random;

/**
 *
 * @author RUI
 */
public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int p1r1 = r.nextInt(1,7);
        int p1r2 = r.nextInt(1,7);
        int p1score = p1r1 + p1r2;
        
        int p2r1 = r.nextInt(1,7);
        int p2r2 = r.nextInt(1,7);
        int p2score = p2r1 + p2r2;
        
        System.out.println("Player 1:");
        System.out.println("First role: " + p1r1);
        System.out.println("Second role: " + p1r2);
        System.out.println("Score: " + p1score);
        
        System.out.println("Player 2:");
        System.out.println("First role: " + p2r1);
        System.out.println("Second role: " + p2r2);
        System.out.println("Score: " + p2score);
        
        if (p1score > p2score) {
            System.out.println("Player 1 wins");
        } else if (p2score > p1score) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Draw");
        }
    }
    
}
