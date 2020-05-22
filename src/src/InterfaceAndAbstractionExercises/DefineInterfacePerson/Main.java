package src.InterfaceAndAbstractionExercises.DefineInterfacePerson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int line = Integer.parseInt(scanner.nextLine());

        Map<String,Buyer> buyersByNames=new HashMap<>();

        for (int i = 0; i < line; i++) {
            String[]tokens=scanner.nextLine().split("\\s+");

            getByers(buyersByNames, tokens);

        }
        String names=scanner.nextLine();


        while (!names.equals("End")){
            if (buyersByNames.containsKey(names)){
                buyersByNames.get(names).buyFood();

            }
            names=scanner.nextLine();
        }
        System.out.println(buyersByNames.values().stream().mapToInt(Buyer::getFood).sum());
    }

    private static void getByers(Map<String, Buyer> buyersByNames, String[] tokens) {
        if (tokens.length==4){
            buyersByNames.put(tokens[0],new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2],tokens[3]));
        }else {
            buyersByNames.put(tokens[0],new Rebel(tokens[0],Integer.parseInt(tokens[1]),tokens[2]));
        }
    }


}
