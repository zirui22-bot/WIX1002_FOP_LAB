/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.lab.pkg3;

/**
 *
 * @author RUI
 */
import java.util.Scanner;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter num1: " );
        int num1 = in.nextInt();
        
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        
        System.out.println("Enter operation +,-,*,/,%");
        String operator = in.next();
        
        switch (operator) {
            case "+": 
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case "-": 
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case "*": 
                System.out.println(num1 + " x " + num2 + " = " + num1*num2);
                break;
            case "/": 
                if (num2 == 0) 
                    System.out.println("Can not be devisible by 0");
                else
                    System.out.println(num1 + " / " + num2 + " = " + ((double) num1/num2));
                break;
            case "%":
                if (num2 == 0) 
                    System.out.println("Can not be devisible by 0");
                else
                    System.out.println(num1 + " % " + num2 + " = " + ((double) num1%num2));
                break;
            default: 
                System.out.println("Enter a valid operation");
                break;
        }
    }
    
}
