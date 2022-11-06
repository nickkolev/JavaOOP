package L05Polymorphism.exercise.P01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption; //in liters per km

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract String drive(double distance);

    public abstract void refuel(double liters);

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String traveling(double fuelConsumption, double distance) {
        DecimalFormat format = new DecimalFormat("#.##");
        if (fuelConsumption <= getFuelQuantity()) {
            setFuelQuantity(getFuelQuantity() - fuelConsumption);
            return String.format(Messages.TRAVELING, getClass().getSimpleName(), format.format(distance));
        }
        return String.format(Messages.NOT_TRAVELING, getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
