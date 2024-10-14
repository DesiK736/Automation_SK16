package Homework03;

import java.util.Scanner;

public class Exercises {
    public static void reviewTriangle(int side1, int side2, int side3) {
        if ((side1 < 90 && side2 < 90 && side3 < 90) && (side1 != 60 && side2 != 60 && side3 != 60)) {
            System.out.println("The type of the triangle is acute");
        } else if (side1 == 90 || side2 == 90 || side3 == 90) {
            System.out.println("The type of the triangle is right-angled");
        } else if (side1 > 90 || side2 > 90 || side3 > 90) {
            System.out.println("The type of the triangle is obtuse");
        } else if (side1 == 60 && side2 == 60 && side3 == 60) {
            System.out.println("The type of the triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The type of the triangle is isosceles");
        } else {
            System.out.println("The type of the triangle is multifaceted");
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter side side1 of the Triangle:");
        int side1 = myScanner.nextInt();

        System.out.println("Enter side side2 of the Triangle");
        int side2 = myScanner.nextInt();

        System.out.println("Enter side side3 of the Triangle");
        int side3 = myScanner.nextInt();
        reviewTriangle(side1, side2, side3);
        myScanner.close();
    }
}

public class Exercises2 {
    public  static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("The 1-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The 2-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The 3-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The 4-th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The 5-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The 6-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The 7-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day name");
        }
    }
}


import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args)  {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the user age?");
        age = scanner.nextInt();
        if (age >= 16)
            System.out.println("Eligible to work");
        else
            System.out.println("Not eligible to work");
    }
}

import java.util.Scanner;

public class Exercises4 {
    public  static void  main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price:  ");
        double  unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity:  ");
        int quantity = scanner.nextInt();
        {
            //calculateRevenue parameters
            double revenue;
            double discountRate = 0;

            //Calculate revenue without discount
            revenue = unitPrice * quantity;

            //Apply discount, based on quantity
            if (quantity  >=  100 && quantity <= 120) {
                discountRate = 0.15;
            } else if (quantity > 120)  {
                discountRate = 0.20;
            }
            //Calculate discounted revenue
            double discountAmount = revenue * discountRate;
            double discountedRevenue = revenue - discountAmount;

            //Display the results
            System.out.printf("The revenue from sale: $%.2f\n", discountedRevenue);
            System.out.printf("The discount rate you received is %.0f%%.\n",  discountRate * 100);
        }
    }
}


import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        //Vacation option request
        System.out.println("Enter the option of  vacation (Beach/Mountain):  ");
        String vacationOption = scanner.nextLine().trim().toLowerCase();

        //Request for the budget  - per day and per person
        System.out.println("Enter your budget per day per person:  ");
        double budgetPerDay = scanner.nextDouble();

        //Advise based on the type of vacation and budget
        switch (vacationOption)  {
            case "beach":
                if (budgetPerDay < 50) {
                    System.out.println("Our advise is to go to Bulgaria for a beach vacation");
                } else {
                    System.out.println("Our advise is to go outside Bulgaria for a beach vacation");
                }
                break;
            case "mountain":
                if (budgetPerDay < 30) {
                    System.out.println("Our advise is to go to Bulgaria for a mountain vacation");
                } else {
                    System.out.println("Our advise is to go outside Bulgaria for a mountain vacation");
                }
                break;
            default:
                System.out.println("Apologies, but there is no information about this type of vacation");
                }
        }
    }

import java.time.Year;
import java.util.Scanner;

public class Exercises6 {
    public static void main(String [] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Year:  ");
        int year  = scanner.nextInt();

        //Check is the year is a leap
        if ((year % 4 == 0 && year %  100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else  {
            System.out.println("Not a leap year");
        }
        }
}

import java.util.Scanner;

public class Exercises7 {
    public static void main(String [] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature:   ");
        double temperature = scanner.nextDouble();

        System.out.println("Convert to (1) Fahrenheit or (2) Celsius?  ");
        int choice = scanner.nextInt();

        double result = (choice == 1) ? (temperature *  9 / 5) + 32 :  (temperature - 32) * 5 / 9;

        System.out.println("Converted temperature:   " + result);
    }
}

