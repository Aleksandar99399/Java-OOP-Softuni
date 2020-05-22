package src.EncapsulationExercises.ShoppingSpree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        String[] arr=scanner.nextLine().split(";");

        Map<String,Person>peopleByNames=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String[] tokens=arr[i].split("=");
            String name=tokens[0];
            double money=Double.parseDouble(tokens[1]);

            Person person=new Person(name,money);
            peopleByNames.putIfAbsent(name,person);

        }
        Map<String,Product>productByNames=new HashMap<>();
        arr=scanner.nextLine().split(";");
        for (int i = 0; i < arr.length; i++) {
            String[] tokens=arr[i].split("=");
            String name=tokens[0];
            double money=Double.parseDouble(tokens[1]);

            Product product=new Product(name,money);
            productByNames.putIfAbsent(name,product);

        }

        String line=scanner.nextLine();

        while (!line.equals("END")) {

            String[] tokens = line.split("\\s+");
            String name=tokens[0];
            String product= tokens[1];

            try {
                peopleByNames.get(name).buyProduct(productByNames.get(product));
                System.out.println(name+" bought "+product);
            }catch (IllegalStateException ex){
                System.out.println(ex.getMessage());

            }


            line = scanner.nextLine();
        }

        for (Person value : peopleByNames.values()) {
            System.out.println(value.toString());
        }

    }

}
