package src.InheritanceLab.RandomArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<String> arrayList = new RandomArrayList<String>(new Random());

        arrayList.add("GOSHO");
        arrayList.add("Alice");
        System.out.println(arrayList.getRandomElement());



    }
}
