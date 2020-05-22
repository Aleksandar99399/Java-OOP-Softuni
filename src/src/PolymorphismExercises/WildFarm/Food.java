package src.PolymorphismExercises.WildFarm;

public abstract class Food {
    private int quantity;

    public Food(int quantity){
        this.setQuantity(quantity);
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected int getQuantity() {
        return quantity;
    }
}
