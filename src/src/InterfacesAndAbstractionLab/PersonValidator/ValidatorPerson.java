package src.InterfacesAndAbstractionLab.PersonValidator;

public class  ValidatorPerson {

    private static Person person;

    public ValidatorPerson(Person person) {
        this.person = person;
    }

    public void validate(){
        validateName();
        validateAge();
    }

    public static void validateName(){
        if (person.getName().equals("Alice")){
            IllegalArgumentException iae;
            iae = new IllegalArgumentException("name cannot be Alice");
            System.out.println(iae);
        }

    }

    public static void validateAge(){
        if (person.getAge()<0){
            IllegalArgumentException iae;
            iae = new IllegalArgumentException("age cannot be a negative number");
            System.out.println(iae);
        }
    }

}
