
import java.util.Scanner;
public class ArithmeticOperation4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double) (num1 + num2) / 2;
        int distance = Math.abs(num1 - num2);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        System.out.printf("Sum: %8d%n", sum);
        System.out.printf("Difference: %8d%n", difference);
        System.out.printf("Product: %8d%n", product);
        System.out.printf("Average: %8.2f%n", average);
        System.out.printf("Distance: %8d%n", distance);
        System.out.printf("Maximum: %8d%n", maximum);
        System.out.printf("Minimum: %8d%n", minimum);
    }
}