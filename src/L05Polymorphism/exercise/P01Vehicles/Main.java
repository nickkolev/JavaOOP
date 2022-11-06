package L05Polymorphism.exercise.P01Vehicles;


import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Car car = null;
    public static Truck truck = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        getCar(scanner);
        getTruck(scanner);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        while (numberOfLines-- > 0) {
            executeCommand(scanner);
        }

        System.out.println(car);
        System.out.println(truck);
    }

    private static void getTruck(Scanner console) {
        String[] truckAttributes = console.nextLine().split("\\s+");
        truck = new Truck(Double.parseDouble(truckAttributes[1]), Double.parseDouble(truckAttributes[2]));
    }

    private static void getCar(Scanner console) {
        String[] carAttributes = console.nextLine().split("\\s+");
        car = new Car(Double.parseDouble(carAttributes[1]), Double.parseDouble(carAttributes[2]));
    }

    private static void executeCommand(Scanner console) {
        String[] commandAttribute = console.nextLine().split("\\s+");
        double argument = Double.parseDouble(commandAttribute[2]);
        Vehicle vehicle = getVehicle(commandAttribute[1]);

        if ("Drive".equals(commandAttribute[0])) {
            System.out.println(Objects.requireNonNull(vehicle).drive(argument));
        } else {
            Objects.requireNonNull(vehicle).refuel(argument);
        }
    }

    private static Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return car;
            case "Truck":
                return truck;
            default:
                return null;
        }
    }
}