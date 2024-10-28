
package Homework04;
//Find the largest number from a given array and print it in a console.

public class Task1 {
    public static void main(String[] args) {
        int [] numbers =  { 7, 1, 32, 0, 76, 18, 94};

        int max = numbers[0];

        for (int  num = 0; num < numbers.length; num++)  {
            if (numbers[num] > max)  {
                max = numbers[num];
            }
        }
        System.out.println("The largest number is:   " + max);
    }
}


/* Given a list iterate it and display numbers which are divisible by 5 and if you  find number
greater than 150 stop the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200] */

public class Task2 {
    public static void main(String[] args) {
        int[] list1 =  {12, 15, 32,  42, 55, 75, 122, 132, 150, 180, 200};

        for (int number  : list1)  {
            if (number > 150) {
                break;
            }
            if (number % 5 == 0)  {
                System.out.println(number);
            }
        }
    }
}

//Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]

public class Task3 {
    public static void main(String[] args) {
        int[] list1 = {10, 20, 30, 40, 50};
        System.out.println("Reversed list: ");

        for (int num = list1.length - 1; num  >= 0; num--)   {
            System.out.println(list1[num]);
        }
    }
}

//Find the first multiple of 5 in an array of numbers.

public class Task4 {
    public static void main(String[] args) {
        int[] numbers =  {14, 27, 39, 48, 77, 65, 15, 45};

        for (int number  :  numbers)   {
            if (number % 5 == 0)   {
                System.out.println("Firs multiple of 5 is:   " + number);
                break;
            }
        }
    }
}

//Print each number from an array of numbers by skipping numbers that multiples of 3

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {7, 13, 53, 47, 84, 30, 12, 18, 23};

        for (int number : numbers)   {
            if (number % 3 == 0)   {
                continue;
            }
            System.out.println(number);
        }
    }
}

//  Write a Java program to calculate the average of a list of numbers.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:   ");
        int list1 = scanner.nextInt();
        double sum = 0;

        System.out.println("Enter the numbers:   ");
       for (int i = 0; i < list1; i++)   {
            sum+= scanner.nextDouble();
        }
        System.out.println("Average is:   " + (sum / list1));
       scanner.close();
    }
}

/* Create an interactive Java program that challenges the user to guess a randomly generated 
number. Write a Java program that generates a random number between 1 and 100.Prompt the 
user to guess the number by entering a value. After each guess, inform the user whether their 
guess was correct, too high, or too low. Continue prompting the user for guesses until they 
correctly guess the number. Once the correct number is guessed, print a congratulatory 
message and terminate the loop. */

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100) + 1, guess = 0;

        System.out.println("Guess the number  (between  1 and  100):   ");

        while (guess != randomNumber)   {
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low, pleas try again.");
            }   else if (guess > randomNumber)   {
                System.out.println("Too high, please try again. ");
            }
        }
        System.out.println("Congrats! You guessed it:   " + randomNumber);
        scanner.close();
    }
}

