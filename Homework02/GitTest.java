// Example with Github synchronization purpose only (for the needs of GitHub Desktop installation)!!!

Import java.util.Scanner;

public class GitTest {
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
