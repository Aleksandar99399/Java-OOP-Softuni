package src.EncapsulationLab.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Team team=new Team("The Black Eagles");

        src.EncapsulationLab.Person.PersonParser personParser=new src.EncapsulationLab.Person.PersonParser();
        for (int i = 0; i < n; i++) {
            try {
                team.addPlayer(personParser.personFrom(reader.readLine()));

            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }

        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players",team.getReserveTeam().size());
    }

}
