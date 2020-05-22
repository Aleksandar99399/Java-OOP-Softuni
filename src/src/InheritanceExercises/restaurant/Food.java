package src.InheritanceExercises.restaurant;

import java.math.BigDecimal;

public class Food extends Product {

    public double getGrams() {
        return grams;
    }

    private  double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams=grams;
    }
}
