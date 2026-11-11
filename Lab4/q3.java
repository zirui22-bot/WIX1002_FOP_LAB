/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg4;

/**
 *
 * @author RUI
 */
import java.util.Scanner;
public class q3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        double sum = 0;
        double sumSquare = 0;

        System.out.print("Enter a score [negative score to quit]: ");
        score = input.nextInt();

        while (score >= 0) {

            count++;
            sum += score;
            sumSquare += score * score;

            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }

            System.out.print("Enter a score [negative score to quit]: ");
            score = input.nextInt();
        }

        if (count > 0) {
            double average = sum / count;

            double standardDeviation = Math.sqrt(
                (sumSquare - (sum * sum / count)) / (count - 1)
            );

            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", average);
            
            if (count > 1) {
                System.out.printf("Standard Deviation: %.2f%n",
                                  standardDeviation);
            } else {
                System.out.println("Standard Deviation: Not available");
            }

        } else {
            System.out.println("No scores entered.");
        }
        }
    
}
