package Homework01;

public class Task4 {
    // Print pine tree using asterisks in the console.
    public static void main(String [] args) {
        int treeHeight = 6;

        //Loop for the top triangle part of the tree
        for (int i = 1; i <= treeHeight; i++) {
            //Print spaces for alignment
            for (int j = treeHeight - i; j > 0; j--) {
                System.out.print(" ");
            }
        //Print asterisks for the tree
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Loop for the trunk of the tree
        for (int i = 0; i < 2; i++) { //Trunk height of 2 lines
            for (int j = 0; j < treeHeight - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*"); //Print the trunk
            }
    }
}
