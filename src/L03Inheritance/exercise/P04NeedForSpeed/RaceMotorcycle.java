package L03Inheritance.exercise.P04NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{

    static final double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
