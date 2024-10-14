package Homework01;

import java.util.Scanner;

public class Task5 {
    // Write a simple program to convert minutes into years and days.
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user for number of minutes
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();

        //Number of minutes in a year
        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
    }
}
