import java.util.Scanner;
public class PowersCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double square = number * number;
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth power: " + fourthPower);
        scanner.close();
    }
}
