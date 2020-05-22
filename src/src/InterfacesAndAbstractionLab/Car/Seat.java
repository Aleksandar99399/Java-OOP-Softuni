package src.InterfacesAndAbstractionLab.Car;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model,
                String color,
                Integer horsepower,
                String countryProduced,
                Double price) {
        super(model, color, horsepower, countryProduced);
        this.price=price;

    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%n%s sells for %f",this.getModel(),this.getPrice());
    }
}
