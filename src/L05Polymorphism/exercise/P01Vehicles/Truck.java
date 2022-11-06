package L05Polymorphism.exercise.P01Vehicles;

public class Truck extends Vehicle{

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String drive(double distance) {
        double fuelConsumption = distance * (getFuelConsumption() + 1.6);
        return traveling(fuelConsumption, distance);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters * 0.95);
    }
}
