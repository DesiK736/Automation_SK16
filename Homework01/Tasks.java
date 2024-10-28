package Homework01;
// Store your names in 3 different variables and print your whole name

public class Task1 {
    public static void main(String[] args) {
        String firstName = "Desislava";
        String middleName = "Krasimirova";
        String lastName = "Kancheva";
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}

/* Print the perimeter of a triangle by given sides. Use formula to calculate it.
    Perimeter = (a+b+c); Input: a=3, b=5, c=7 */

public class Task2 {
    public static int findPerimeter(int a, int b, int c)
    {
        return (a + b + c);
    }
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        System.out.println(findPerimeter(a, b, c));
    }
}

// Print the area of a triangle by given sides. Use formula to calculate it.
// Area of Triangle = (width * height)/2; Width=3; Height=5

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width of the Triangle:");
        double a = scanner.nextDouble();

        System.out.println("Enter the Height of the Triangle");
        double h = scanner.nextDouble();

        double area = (a * h) / 2;
        System.out.println("Area of Triangle is: " + area);
        scanner.close();
    }
}

// Print pine tree using asterisks in the console.

public class Task4 {
    public static void main(String [] args) {
        int treeHeight = 6;

        for (int i = 1; i <= treeHeight; i++) {
            for (int j = treeHeight - i; j > 0; j--) {
                System.out.print(" ");
            }
        
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < treeHeight - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*"); 
            }
    }
}

// Write a simple program to convert minutes into years and days.

import java.util.Scanner;

public class Task5 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();

        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
        scanner.close();
    }
}
