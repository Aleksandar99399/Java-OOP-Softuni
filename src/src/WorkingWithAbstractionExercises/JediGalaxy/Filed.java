package src.WorkingWithAbstractionExercises.JediGalaxy;

public class Filed {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Filed(int rows, int cols) {
        this(rows, cols, 0);
    }

    public Filed(int rows, int cols, int beginFillValue) {
        this.matrix = new int[rows][cols];
        this.fillValues(beginFillValue);
    }

    private void fillValues(int beginValue) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = beginValue++;
            }

        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && row < this.matrix.length && col >= 0 && col < this.matrix[row].length;
    }

    public void setValue(int row, int col,int value) {
        this.matrix[row][col]=value;
    }

    public int getColLength(int i) {
        return this.matrix[i].length;
    }

    public int getValue(int row, int col) {
        return this.matrix[row][col];
    }
}

