package src.WorkingWithAbstractionExercises.JediGalaxy;

public class Galaxy {
    private Filed filed;
    private Movement jediMovement;
    private Movement sithMovement;


    public Galaxy(Filed filed, Movement first, Movement second) {
        this.filed = filed;
        this.jediMovement=first;
        this.sithMovement=second;
    }

    public void moveSith(int row, int col) {
        this.sithMovement.move(row,col,this.filed);
    }

    public long moveJedi(int row, int col) {
        return this.jediMovement.move(row,col,this.filed);
    }
}
