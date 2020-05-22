package src.PolymorphismExercises.Vehicles;

public class Truck extends Vehicles {

    private static final double AIR_CONDITIONER_CONSUMPTION=1.6;

    public Truck(double fuel, double fuelConsumption, double capacity) {
        super(fuel, fuelConsumption, capacity);
    }


    @Override
    public double getFuelConsumption(double km) {
        return super.getFuelConsumption(km)+(AIR_CONDITIONER_CONSUMPTION*km);
    }

    @Override
    public void refuel(double refuel) {
        super.refuel(refuel);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
