package Homework09;
/* Handling User Input Errors - create a program that prompts the user to
enter an integer. Use a try-catch block to handle situations where the user
enters something other than an integer (e.g., a letter or symbol). If an error
occurs, display a friendly error message and prompt the user to try again. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean hasValidInput = false;

        while (!hasValidInput) {
            System.out.print("Please enter an integer: ");
            try {
                // Using scanner.nextLine() to read input as a string
                number = Integer.parseInt(scanner.nextLine());
                hasValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: That's not a valid integer. Please try again!");
            }
        }

        System.out.println("Thank you! You entered successfully the number:  " + number);
        scanner.close();
    }
}


/* File Reading and Parsing - You need to write a Java program that reads an
integer from a file and parses it to calculate the square root. If the file
cannot be found (FileNotFoundException) or if the content of the file is not
a valid integer(NumberFormatException), handle these exceptions
appropriately and print messages to the user. Hint */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("D:\\My Documents\\Desktop\\info.txt");
        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextLine()) {
                String content = scanner.nextLine();
                try {
                    int number = Integer.parseInt(content); // Try to parse the content as an integer
                    double squareRoot = Math.sqrt(number);
                    System.out.println("The square root of " + number + " is " + squareRoot);
                } catch (NumberFormatException e) {
                    System.out.println("Problem occurred: The content of the file is not a valid integer! ");
                }
            } else {
                System.out.println("Problem occurred: The file is empty! ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem occurred: The file 'info.txt' was not found! ");
        }
    }
}

