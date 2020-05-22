package src.PolymorphismExercises.Vehicles;

public class Bus extends Vehicles {
    private static final double AIR_CONDITIONER_CONSUMPTION=1.4;


    public Bus(double fuel, double fuelConsumption, double capacity) {
        super(fuel, fuelConsumption, capacity);
    }

   @Override
   public double getFuelConsumption(double km) {

           return super.getFuelConsumption(km)+AIR_CONDITIONER_CONSUMPTION*km;
   }

   @Override
    public String drive(double km){
        return super.drive(km);
    }

    @Override
    public void withOutPassenger(double km){
         super.drive(km);

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
