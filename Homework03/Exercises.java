package Homework03;

/*Write a program which calculates if a triangle can be built by 3 given angles. The 
angles are taken from the user input. There are two possible outputs – if the triangle 
can’t be built based on the angle values or the triangle can be built based on the angle 
values. If the triangle is possible the output should contain also the type of the triangle 
– acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен), equilateral 
(равностранен), isosceles (равнобедрен), multifaceted (разностранен).
import java.util.Scanner;*/

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

/*Write a program to print the days of the week based on the user digit 1-7 
input. The message should be “The [user input digit]-st/nd/rd/th day of the 
week is [the day of the week]”*/

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

/* Write Java program to allow the user to input his/her age. Then the program 
will show if the person is eligible to work. A person who is eligible to work 
must be older than or equal to 16 years old. */

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
        scanner.close();
    }
}

/*Write a Java program to calculate the revenue from a sale based on the unit price and 
quantity of a product input by the user. The discount rate is 15% for the quantity 
purchased between 100 and 120 units, and 20% for the quantity purchased greater than 
120 units. If the quantity purchased is less than 100 units, the discount rate is 0%.
import java.util.Scanner;*/

public class Exercises4 {
    public  static void  main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price:  ");
        double  unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity:  ");
        int quantity = scanner.nextInt();
        {
            double revenue;
            double discountRate = 0;

            revenue = unitPrice * quantity;

            if (quantity  >=  100 && quantity <= 120) {
                discountRate = 0.15;
            } else if (quantity > 120)  {
                discountRate = 0.20;
            }
          
            double discountAmount = revenue * discountRate;
            double discountedRevenue = revenue - discountAmount;

            System.out.printf("The revenue from sale: $%.2f\n", discountedRevenue);
            System.out.printf("The discount rate you received is %.0f%%.\n",  discountRate * 100);
            scanner.close();
        }
    }
}

/* Write a program which advices the user where to go to a vacation based on the type of the 
vacation and the budget. There should be two options – Beach, Mountain. If the user put a 
different value then the program should print a message that there is no information about this 
type of vacation. Budgets are considered per day per person. If the budget per day for Beach 
type vacation is smaller than 50 then the program should advise Bulgaria as a destination, 
otherwise Outside Bulgaria. If the budget per day for Mountain type vacation is smaller than 30 
then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria. */

import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the option of  vacation (Beach/Mountain):  ");
        String vacationOption = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter your budget per day per person:  ");
        double budgetPerDay = scanner.nextDouble();

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
                scanner.close();
                }
            }
         }

/* Write a program that asks the user to enter a year. Check if the year is a leap
year. A year is a leap year if it is divisible by 4 but not divisible by 100, except
when it is divisible by 400. Print "Leap year" or "Not a leap year" based on the
result. Hint: A leap year must be divisible by 4, and not divisible by 100 unless is
divisible by 400 */

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
            scanner.close();
        }
      }
    }

/* Write a program that converts temperature between Celsius and 
Fahrenheit. The user should be able to choose the direction of conversion. 
The program should prompt the user to enter a temperature and then ask if 
they want to convert from Celsius to Fahrenheit or Fahrenheit to Celsius. 
Perform the conversion based on the user's choice and print the result.*/

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
        scanner.close();
    }
}

