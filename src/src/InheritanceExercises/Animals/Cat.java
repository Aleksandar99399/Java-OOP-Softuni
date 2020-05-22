package src.InheritanceExercises.Animals;

public class Cat extends src.InheritanceExercises.Animals.Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound(){
        return "Meow meow";
    }
}
