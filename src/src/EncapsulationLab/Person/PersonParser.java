package src.EncapsulationLab.Person;

public class PersonParser {

    public Person personFrom(String line){
        String []split=line.split("\\s+");
        String name=split[0];
        String last=split[1];
        int age= Integer.parseInt(split[2]);
        double salary=Double.parseDouble(split[3]);

        return new Person(name,last,age,salary);
    }
}
