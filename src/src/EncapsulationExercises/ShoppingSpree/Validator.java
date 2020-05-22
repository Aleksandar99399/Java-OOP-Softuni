package src.EncapsulationExercises.ShoppingSpree;

public class Validator {

    private Validator(){

    }

    public static void validateName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

    }

    public static void validateMoney(double money){
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
