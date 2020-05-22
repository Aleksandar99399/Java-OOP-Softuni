package src.PolymorphismExercises.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicles {

    private double fuel;
    private double fuelConsumption;
    private double capacity;

    public Vehicles(double fuel, double fuelConsumption, double capacity) {
        this.setFuel(fuel);
        this.fuelConsumption = fuelConsumption;
        this.capacity=capacity;
    }

    public double getFuelConsumption(double km) {
        return km * this.fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public String drive(double km) {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        double currentFuel = this.getFuelConsumption(km);
        if (this.getFuel() >= currentFuel) {
            this.setFuel(this.getFuel() - currentFuel);
            return String.format("%s travelled %s km", getClass().getSimpleName(), decimalFormat.format(km));
        } else {
            return String.format("%s needs refueling", getClass().getSimpleName());
        }

    }

   protected void withOutPassenger(double additional){
        this.fuelConsumption+=additional;

   }

    public  void refuel(double refuel){
        if (refuel<=0){
            System.out.println("Fuel must be a positive number");
        }else {
            if (getFuel() + refuel > getCapacity()) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                setFuel(getFuel() + refuel);
            }
        }
    }

    public void setFuel(double fuel) {

            this.fuel = fuel;

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), getFuel());
    }

    public double getCapacity() {
        return capacity;
    }
}
