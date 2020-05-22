package src.EncapsulationExercises.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String line = scanner.nextLine();
        Team team=new Team();
        List<Team>teamList=new ArrayList<>();


        while (!line.equals("END")){
            String[] tokens = line.split(";");

            switch (tokens[0]) {
                case "Team":

                    team = new Team(tokens[1]);
                    teamList.add(team);
                    break;
                case "Add": {
                    String nameTeam = tokens[1];
                    try {

                        validateRating(teamList,nameTeam);
                        String playerName = tokens[2];
                        int endurance = Integer.parseInt(tokens[3]);
                        int sprint = Integer.parseInt(tokens[4]);
                        int dribble = Integer.parseInt(tokens[5]);
                        int passing = Integer.parseInt(tokens[6]);
                        int shooting = Integer.parseInt(tokens[7]);

                        try {

                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            team.addPlayer(player);
                            teamList.add(team);
                        }catch (IllegalArgumentException ex){
                            System.out.println(ex.getMessage());
                        }
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }

                    break;
                }
                case "Remove":
                    try {

                        team.removePlayer(tokens[2]);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "Rating": {
                    String nameTeam = tokens[1];
                    try {
                        validateRating(teamList, nameTeam);
                        System.out.printf("%s - %d",nameTeam,Math.round(team.getRating()));
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }



                    break;
                }
            }

            line=scanner.nextLine();
        }


    }
    public static void validateRating(List<Team> team, String name){
        boolean isExist=false;
        for (Team team1 : team) {
            if (team1.getName().equals(name)) {
                isExist=true;
            }
        }
        if (!isExist) {
            throw new IllegalArgumentException(String.format("Team %s does not exist.", name));
        }


    }

}
