package L07ExceptionsAndErrorHandling;

import java.util.Scanner;

public class P02SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        Double result = -1.0;

        try {
            result = sqrt(Integer.parseInt(number));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            if (result != -1) {
                System.out.printf("%.2f%n", result);
            }
            System.out.println("Goodbye");
        }
    }

    public static double sqrt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid");
        }

        return Math.sqrt(n);
    }
}
