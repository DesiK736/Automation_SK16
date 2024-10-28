package Homework07;
//Write a Java method to find the smallest number among three numbers.

public class Task1 {
    public static double minNum(double a, double b, double c)   {
        return Math.min(Math.min(a, b), c);
    }
public static void main(String[] args) {
    double a = 25.5;
    double b = 14.6;
    double c = 9.8;

    double smallestNumber = minNum(a, b, c);
    System.out.println("The smallest number is:  " + smallestNumber);
}
    }

//Write a Java method to compute the average of three numbers.

public class Task2 {
    public static int computeAverage(int firstNum, int secondNum, int thirdNum)  {
        return (firstNum + secondNum + thirdNum)  / 3;
    }

    public static void main(String[] args) {
        int firstNum = 245;
        int secondNum= 144;
        int thirdNum = 345;
        int average = computeAverage(firstNum, secondNum, thirdNum);
        System.out.println("The average number is:  " + average);
    }
}

/*Write a Java method to display the middle character of a string: If the length of the string is even there will be two
 middle characters. ;If the length of the string is odd there will be one middle character*/

public class Task3 {
    public static String checkMiddleCharacter(String string)   {
        int length = string.length();
        int middleIndex = length / 2;

        if (length %  2 == 0) {
            return string.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return Character.toString(string.charAt(middleIndex));
        }
    }

    public static void main(String[] args) {
        String display1 = "fantastic";
        String display2 = "tricky";
        System.out.println("Middle character(s) of \"" + display1 + "\":  " + checkMiddleCharacter(display1));
        System.out.println("Middle character(s) of \"" + display2 + "\":  " + checkMiddleCharacter(display2));
    }
}

//Write a Java method to count all words in a string.

public class Task4 {
    public static int calculateWords(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        String[] words = word.trim().split("\\s+"); // --> \\s+ -->splits the string by one or more whitespace characters
        return words.length;
    }

    public static void main(String[] args) {
        String example = "The weather seems to be sunny today.";
        int countWord = calculateWords(example);
        System.out.println("The number of words in the string is:  " + countWord);
    }
}

//Write a Java method to find the second largest number in an array of integers.

public class Task5 {
    public static int findSecondLargest(int [ ] nums)   {
        int largestNum = Integer.MIN_VALUE, secondLargest = Integer.MAX_VALUE;

        for (int num :  nums)   {
            if (num > largestNum) {
                secondLargest = largestNum;
                largestNum = num;
            } else if (num > secondLargest  &&  num < largestNum)   {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [ ] numbers = {25, 43, 59, 67, 81, 92, 96};
        System.out.println("The second largest number is:   " + findSecondLargest(numbers));
    }
}

/*Write a Java method to remove duplicate elements from an array of numbers and return a new array
with only unique elements.*/

import java.util.stream.IntStream;

public class Task6 {
    public static int[] removeDuplicates(int[ ] nums)   {
        return IntStream.of(nums).distinct().toArray();
    }

    public static void main(String[] args) {
        int[ ] numbers = {5, 12, 19, 23, 23, 54, 62, 62};
        int[ ] uniqueNumbers = removeDuplicates(numbers);

        System.out.print("Array with unique elements:   ");
        for (int num : uniqueNumbers)   {
            System.out.print(num + "  ");
        }
    }
}

/*Write a Java method to display the last character of a string.
If the string is empty, display a message indicating that there is no last character.*/

public class Task7 {
    public static void displayLastCharacter(String character)   {
        if (character == null  || character.isEmpty()) {
            System.out.println("There is no last character.");
        } else  {
            char lastCharacter = character.charAt(character.length() - 1);
            System.out.println("The last character is:   " + lastCharacter);
        }
    }

    public static void main(String[] args) {
        displayLastCharacter("Paragraph");
    }
}

/*Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false otherwise*/

public class Task8 {
    public static boolean checkIsEven(int number)   {
        return number % 2 == 0;  //Handle single-digit numbers are always palindromes.
    }

    public static void main(String[] args) {
        System.out.println(checkIsEven(4));
        System.out.println(checkIsEven(7));
    }
}

/*A takes as input a non-negative integer and returns true if the number is a palindrome.
 Non-negative integer is called a palindrome if it reads forward and backward in the same way.
 For example, the numbers 5, 121, 3443, and 123454321 are palindromes.*/

public class Task9 {
    public  static boolean isPalindrome(int number)   {
        int reversed = 0, original = number;

        while (number > 0)   {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(3443));
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(123));
    }
}
