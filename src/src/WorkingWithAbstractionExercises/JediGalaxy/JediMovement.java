package src.WorkingWithAbstractionExercises.JediGalaxy;

public class JediMovement implements Movement {
    @Override
    public long move(int row, int col, Filed filed) {
        long starsPower=0;
        while (row >= 0 && col < filed.getColLength(1)) {
            if (filed.isInBounds(row,col)){
                starsPower += filed.getValue(row,col);
            }

            row--;
            col++;
        }
        return starsPower;
    }
}
