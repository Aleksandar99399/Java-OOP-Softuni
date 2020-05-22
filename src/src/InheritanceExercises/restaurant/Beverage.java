package src.InheritanceExercises.restaurant;

import java.math.BigDecimal;

public class Beverage extends Product {
    public double getMilliliters() {
        return milliliters;
    }

    private double milliliters;
    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters=milliliters;
    }
}
