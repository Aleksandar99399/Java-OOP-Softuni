package src.EncapsulationExercises.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;


    public Team(){

    }
    public Team(String name) {
        this();
        this.setName(name);
        this.players = new ArrayList<>();

    }

    public double getRating() {
        return this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.00);

    }

    public void addPlayer(Player player) {

        this.players.add(player);
    }

    public void removePlayer(String player) {
        int index=-1;
        boolean isExist=false;
        for (Player player1 : this.players) {
            if (player1.getName().equals(player)){
                index=players.indexOf(player1);
                isExist=true;
            }
        }
        if (!isExist) {
            throw new IllegalArgumentException(
                    "Player " + player + " is not in " + this.getName() + " team.");
        }else {
            this.players.remove(index);
        }

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validate.validateName(name);
        this.name = name.trim();
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
