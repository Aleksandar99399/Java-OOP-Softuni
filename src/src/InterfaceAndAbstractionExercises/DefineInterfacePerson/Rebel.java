package src.InterfaceAndAbstractionExercises.DefineInterfacePerson;

public class Rebel extends AbstractCitizen {

    private String group;


    public Rebel(String name, int age, String group) {
        super(name,age);
        this.group = group;
    }


    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {
        super.addFood(5);
    }
}
