package L07ExceptionsAndErrorHandling;

import java.util.Arrays;
import java.util.Scanner;

public class P01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = range[0];
        int end = range[1];

        System.out.println("Range: [" + start + "..." + end + "]");

        boolean isInRange = false;

        while (!isInRange) {
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if(number >= start && number <= end) {
                    System.out.println("Valid number: " + number);
                    isInRange = true;
                } else {
                    System.out.println("Invalid number: " + input);
                }
            } catch (NumberFormatException ignored) {
                System.out.println("Invalid number: " + input);
            }
        }

    }
}
