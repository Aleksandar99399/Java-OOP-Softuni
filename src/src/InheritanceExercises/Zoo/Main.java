package src.InheritanceExercises.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal>animals=new ArrayList<>();
        animals.add(new Snake("Python"));
        animals.add(new Lizard("Gandalf"));
        animals.add(new Gorilla("King kong"));
        animals.add(new Bear("Winnie the bear"));

        for (Animal animal : animals) {
            animal.feedAnimal();
        }

    }
}
