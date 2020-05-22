package src.ExceptionAndHandlingLab.PersonPackage;

import src.ExceptionAndHandlingLab.CustomException.PersonCreationException;

public class Peron {
    private String firstName;
    private String lastName;
    private int age;

    public Peron(String firstName, String lastName, int age) throws PersonCreationException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    private boolean myStringIsNotEmpty(String str){
        return str==null||str.trim().isEmpty();
    }

    public void setFirstName(String firstName) throws PersonCreationException {
        validateString(firstName);
        this.firstName = firstName;

    }

    private void validateString(String name) throws PersonCreationException {
        if (myStringIsNotEmpty(name)){
            throw new PersonCreationException("Invalid name");
        }
    }

    public void setLastName(String lastName) throws PersonCreationException {
        validateString(lastName);
        this.lastName = lastName;
    }

    public void setAge(int age) throws PersonCreationException {
        if (age<0||age>120){
            throw new PersonCreationException("Invalid age");
        }
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
