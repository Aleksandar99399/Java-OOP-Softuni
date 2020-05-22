package src.InterfacesAndAbstractionLab.PersonValidator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person>list=new ArrayList<>();
        try {
            Person person=new Person("Mal",-1);
            ValidatorPerson validatorPerson=new ValidatorPerson(person);
            validatorPerson.validate();
            list.add(person);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        for (Person person : list) {
            System.out.println(person.toString());
        }


    }
}
