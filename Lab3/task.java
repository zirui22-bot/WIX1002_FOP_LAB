/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg3;

/**
 *
 * @author RUI
 */
public class task {
    
    public static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        return (y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1);
    }

    public static void main(String[] args) {
        int[][] points1 = {{1, 1}, {2, 3}, {3, 2}};
        System.out.println("Test Case 1 Result: " + isBoomerang(points1));

        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}};
        System.out.println("Test Case 2 Result: " + isBoomerang(points2));
        
        int[][] points3 = {{1, 1}, {1, 1}, {2, 2}};
        System.out.println("Test Case 3 Result: " + isBoomerang(points3));
    }
}