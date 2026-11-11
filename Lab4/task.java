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
public class task {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {

            // 1. Get the input from users
            System.out.print("Enter the year: ");
            int year = sc.nextInt();

            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
                    || (year % 400 == 0);

            int dayUntilNov = 31 + (isLeapYear ? 29 : 28)
                    + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;

            int firstDayOfNov = (firstDayOfYear + dayUntilNov) % 7;

            // Convert Sunday-first to Monday-first
            firstDayOfNov = (firstDayOfNov + 6) % 7;

            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n";

            // 3. Print the calendar of November
            System.out.println("November");

            System.out.printf(format, "Mon", "Tue", "Wed",
                    "Thu", "Fri", "Sat", "Sun");

            for (int i = 0; i < firstDayOfNov; i++) {
                System.out.printf(columnFormat, "");
            }

            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);

                if ((i + firstDayOfNov) % 7 == 0) {
                    System.out.println();
                }
            }
        }
        }
    
}
