package src.InheritanceExercises.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(in));
        Child child=new Child(rd.readLine(),Integer.parseInt(rd.readLine()));

        System.out.println(child.getName());
        System.out.println(child.getAge());

    }
}
