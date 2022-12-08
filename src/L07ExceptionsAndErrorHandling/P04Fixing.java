package L07ExceptionsAndErrorHandling;

import java.util.Scanner;

public class P04Fixing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for (int i = 0; i < weekDays.length; i++) {
            try {
                System.out.println(weekDays[i]);
            } catch (IndexOutOfBoundsException e) {

            }
        }
        scanner.nextLine();
    }
}
