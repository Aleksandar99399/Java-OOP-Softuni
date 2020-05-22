package src.InheritanceExercises.Zoo;

public class Snake extends Reptile {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("I eat a mouse");
    }
}
