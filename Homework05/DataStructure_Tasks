package Homework05;
//Write program to print sum of a given array elements

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:   ");

        int listOfItems = scanner.nextInt();
        int[] arrays = new int[listOfItems];
        int sum = 0;
        System.out.println("Enter elements:   ");

        for (int i = 0; i < listOfItems; i++) sum += scanner.nextInt();
        System.out.println("Sum:   " + sum);
        scanner.close();
    }
}

//Print elements of a given 2-d matrix with 4 rows and 3 columns

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {15, 9, 38},
                {2, 64, 81},
                {44, 37, 3},
                {19, 50, 27}
        };
        for (int[] listedArrays  :  matrix)  {

        for (int listedArray : listedArrays) {
            System.out.print(listedArray + "  ");
        }
            System.out.println();
        }
    }
}

//Print elements of a given 2-d matrix with dynamic rows and columns taken from user input

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns:   ");

        int rows = scanner.nextInt(), cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:   ");
        for (int d = 0; d  < rows; d++)
            for (int k  = 0; k < cols; k++)
                matrix[d][k] = scanner.nextInt();

        System.out.println("Matrix:   ");
        for (int[] row  :  matrix)   {
            for (int element  :  row)   System.out.print(element + "  ");
            System.out.println();
        }
        scanner.close();
    }
}

/*Create a to-do list and manage tasks with the ability to add new tasks, mark tasks as completed,
remove completed tasks, and display the current list.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
static  ArrayList<String>  tasks = new ArrayList<>();
static  ArrayList<Boolean> completed  = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true)   {
            System.out.println("\n1.  Add  Task  2.  Complete Task  3.  Remove Completed  4.  Show  Tasks  5.  Exit");
            switch (scanner.nextInt())   {
                case  1  ->  addTask();
                case  2  -> completeTask();
                case  3  ->  removeCompletedTasks();
                case  4  ->  showTasks();
                case  5  ->  {   return;  }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    static void addTask() {
        System.out.print("Enter task:   ");
        scanner.nextLine();
        tasks.add(scanner.nextLine());
        completed.add(false);
    }
    static void completeTask() {
        showTasks();
        System.out.print("Enter task number to complete:   ");
        int taskNumber = scanner.nextInt() - 1;
        if (taskNumber >= 0 && taskNumber < tasks.size()) completed.set(taskNumber, true);
    }
    static void removeCompletedTasks()   {
        for (int d = completed.size()  -  1;  d >=  0; d--)
            if (completed.get(d))  {  tasks.remove(d);  completed.remove(d);   }
    }
    static void showTasks()   {
        if (tasks.isEmpty())  System.out.println("No tasks. ");
        for (int d = 0;  d < tasks.size();  d++)
            System.out.println((d + 1) + ".  " +  (completed.get(d)  ?  " [X]  "  :  "[  ]  " ) + tasks.get(d));
    }
}

//Exercises with Array

import java.util.Arrays;

public class Tasks_Array {
    public static void main(String[] args) {
        String[ ] colors = new String[6]; //array with defined size of 6 elements
        colors[0] = "green";
        colors[1] = "red";
        colors[2] = "yellow";
        colors[3] = "pink";
        colors[4] = "white";
        colors[5] = "blue";

        System.out.println("The fourth color is:  " + colors[3]); //the 4th color is under index 3, starting at 0
      //loop through all colors and print them
        for (int i = 0;  i < colors.length; i++);   {
            System.out.println(Arrays.toString(colors)); //we should use method toString() to convert "int" to String

            for (String color : colors)   {
                System.out.println(color); //2-nd option for looping through the colors

                Arrays.stream(colors).forEach(System.out::println); //3-rd option for looping through the elements
            }
        }
    }
}


//Exercises with ArrayList

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Tasks_ArrayList {
    public static void main(String[] args) {
        ArrayList<String>  vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Cucumber");
        vegetables.add("Carrot");
        vegetables.add("Corn");
        vegetables.add("Spinach");

        System.out.println("Vegetables:   " + vegetables); //print the vegetable list
        System.out.println(vegetables.size()); //print the size of the elements: 5 in total
        System.out.println(vegetables.contains("Corn")); //check whether it contains in the list: true
        System.out.println(vegetables.contains("Tomato")); //----------||----------- : false - it not contains in the list

        for (String vegetable  :  vegetables)   {
            System.out.println(vegetable); //loop through the list
            vegetables.forEach(System.out::println); //2-nd option for looping through the list

            System.out.println("First vegetable:  " + vegetables.get(0)); //get the 1-st item under index 0

            vegetables.set(4,  "Eggplant"); //change an item under index 4
            System.out.println("Updated ArrayList:  " + vegetables);

            vegetables.remove("Cucumber"); //remove an item from the list
            System.out.println("Updated ArrayList:  " + vegetables);
            }
        }
    }

//Exercises with LinkedList
import java.util.LinkedList;

public class Tasks_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>   languages = new LinkedList<>();
                languages.add("Java");
                languages.add("Python");
                languages.add("C#");
                languages.add("JavaScript");
        System.out.println("LinkedList:   " + languages);

        languages.add(3,  "PHP"); //add method with the index parameter
        System.out.println("Updated LinkedList:   " +  languages);

        String string  = languages.get(0); //access an element from LinkedList with get() method
        System.out.println("Element at index 0:   " + string);

        languages.set(2, "Kotlin"); //change elements at index with set() method
        System.out.println("Updated LinkedList:   " + languages);

        String string1 = languages.remove(3); //remove elements from index with remove() method
        System.out.println("Removed Element:    " + string1);
        System.out.println("Updated LinkedList:   " + languages);

        languages.addFirst("Kotlin");
        languages.addLast("C#");
        System.out.println("Updated LinkedList:   " + languages);
    }
}
