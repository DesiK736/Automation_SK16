package Homework01;

public class Task2 {
    /* Print the perimeter of a triangle by given sides. Use formula to calculate it.
    Perimeter = (a+b+c); Input: a=3, b=5, c=7 */
    public static int findPerimeter(int a, int b, int c)
    {
        return (a + b + c);
    }
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        System.out.println(findPerimeter(a, b, c));
    }
}
