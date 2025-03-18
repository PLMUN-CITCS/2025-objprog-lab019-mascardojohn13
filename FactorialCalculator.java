import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // Get valid user input
        long factorial = calculateFactorial(number); // Compute factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // Display result
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int num;

        // Keep prompting until a valid non-negative integer is entered
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a valid integer.");
                scanner.next(); // Discard invalid input
            }
        }
        scanner.close(); // Close scanner to avoid resource leaks
        return num;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply numbers from 1 to n
        }
        return factorial;
    }
}
