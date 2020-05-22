package src.InterfaceAndAbstractionExercises.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String line = scanner.nextLine();

        List<Identifiable> robotList = new ArrayList<>();
        List<String> detained = new ArrayList<>();

        while (!line.equals("End")) {
            String[] tokens=line.split("\\s+");
            if (tokens.length == 3) {
                String name=tokens[0];
                int age=Integer.parseInt(tokens[1]);
                String id=tokens[2];
                robotList.add(new Citizen(name, age, id));
            } else {
                String model=tokens[0];
                String id=tokens[1];
                robotList.add(new Robot(id,model));
            }
            line = scanner.nextLine();
        }

        String number =scanner.nextLine();
        checkForDetained(robotList, detained, number);
        for (String s : detained) {
            System.out.println(s);
        }


    }

    private static void checkForDetained(List<Identifiable> robotList,
                                         List<String> detained,
                                         String number) {
        for (Identifiable robot : robotList) {
            if (robot.getId().endsWith(number)) {
                detained.add(robot.getId());
            }
        }
    }
}
