package L03Inheritance.exercise.P04NeedForSpeed;

public class SportCar extends Vehicle{

    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
