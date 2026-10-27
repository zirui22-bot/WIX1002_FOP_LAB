/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.lab.pkg2;

import java.util.Random;

/**
 *
 *      int ori_num = num;
        int sum = 0;
        int sum1 = 0;
        
        while(num >0){ 
            sum += num % 10;
            num /= 10;
                    
        }
        
        num = ori_num;
        
        for (; num > 0 ; num /= 10){ 
            sum1 += num%10;
        
        }
        
        
        
        System.out.println("Random number: " + ori_num);
        System.out.println("The sum of all the digits using while loop: " + sum);
        System.out.println("The sum of all the digits using for loop: " + sum1);
        }
        
       @author RUI
 */
public class Q5 {
        public static void main(String[] args){ 
        Random random = new Random();
        int num = random.nextInt(10001);
        int ori_num = num;
        int sum = 0;
        int sum1 = 0;
        
        while(num >0){ 
            sum += num % 10;
            num /= 10;
                    
        }
        
        num = ori_num;
        
        for (; num > 0 ; num /= 10){ 
            sum1 += num%10;
        
        }
        
        
        
        System.out.println("Random number: " + ori_num);
        System.out.println("The sum of all the digits using while loop: " + sum);
        System.out.println("The sum of all the digits using for loop: " + sum1);
        
        }
        
}
       
