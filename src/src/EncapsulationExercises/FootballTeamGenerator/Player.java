package src.EncapsulationExercises.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(){

    }
    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this();
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public double overallSkillLevel(){
        return (double) (this.endurance+this.shooting+this.sprint+this.dribble+this.passing)/5;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validate.validateName(name);
        this.name = name.trim();
    }

    private void setEndurance(int endurance) {
        Validate.validateStats("Endurance",endurance);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        Validate.validateStats("Sprint",sprint);
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        Validate.validateStats("Dribble",dribble);
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        Validate.validateStats("Passing",passing);
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        Validate.validateStats("Shooting",shooting);
        this.shooting = shooting;
    }
}

