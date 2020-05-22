package src.InterfacesAndAbstractionLab.PersonValidator;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ValidatorPerson.validateAge();
        this.age = age;
    }

    public void setName(String name) {
        ValidatorPerson.validateName();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
