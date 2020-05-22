package src.InterfaceAndAbstractionExercises.DefineInterfacePerson;

public class Citizen extends AbstractCitizen implements Birthable,Identifiable,Buyer {

    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name,age);
        this.id = id;
        this.birthDate = birthDate;
    }


    @Override
    public void buyFood() {
        super.addFood(10);
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
