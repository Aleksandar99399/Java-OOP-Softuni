package src.InheritanceExercises.Zoo;

public class Lizard extends Reptile {
    public Lizard(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("mana plus plus");
    }
}
