package L05Polymorphism.exercise.P01Vehicles;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String drive(double distance) {
        double fuelConsumption = distance * (getFuelConsumption() + 0.9);
        return traveling(fuelConsumption, distance);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }
}
