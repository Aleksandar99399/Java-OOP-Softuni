package src.InterfaceAndAbstractionExercises.Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        List<String> numbers = Arrays.stream(rd.readLine().split(" ")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(rd.readLine().split(" ")).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(numbers, urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
