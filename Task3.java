package Homework01;

import java.util.Scanner;

public class Task3 {
    // Print the area of a triangle by given sides. Use formula to calculate it.
    // Area of Triangle = (width * height)/2; Width=3; Height=5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width of the Triangle:");
        double a = scanner.nextDouble();

        System.out.println("Enter the Height of the Triangle");
        double h = scanner.nextDouble();

        double area = (a * h) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}