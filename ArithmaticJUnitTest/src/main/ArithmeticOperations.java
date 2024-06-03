package src.main;
import java.util.Scanner;

public class ArithmeticOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        String stop = "";
        Scanner scanner = new Scanner(System.in);
        while(!stop.toUpperCase().equals("STOP")){
            System.out.println("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.println ("Enter the second number: ");
            int b = scanner.nextInt();
            ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
            System.out.println("Addition: " + arithmeticOperations.add(a, b));
            System.out.println("Subtraction: " + arithmeticOperations.subtract(a, b));
            System.out.println("Multiplication: " + arithmeticOperations.multiply(a, b));
            try {
                System.out.println("Division: " + arithmeticOperations.divide(a, b));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter STOP to exit or any other key to continue: ");
            stop = scanner.next();
        }
        scanner.close();
    }
}
