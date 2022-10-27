package L01WorkingWithAbstraction.lab.P2PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] coordinates = getCoordinates(scanner);

        Point bottomLeftPoint = new Point(coordinates[0], coordinates[1]);
        Point topRightPoint = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = getCoordinates(scanner);

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            boolean isInside = rectangle.contains(point);

            System.out.println(isInside);
        }
    }

    private static int[] getCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
