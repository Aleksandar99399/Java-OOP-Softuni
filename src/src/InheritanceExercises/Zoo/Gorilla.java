package src.InheritanceExercises.Zoo;

public class Gorilla extends Mammal {
    public Gorilla(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("I eat banana");
    }
}
