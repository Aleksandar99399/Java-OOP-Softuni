package src.WorkingWithAbstractionExercises.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine());
        Movement jediMovement = new MoveAndPrint();
        Movement sithMovement=new SithMovement();


        Galaxy galaxy = new Galaxy(new Filed(dimensions[0], dimensions[1]),jediMovement,sithMovement);
        String positions = scanner.nextLine();
        long starsPower = 0;
        while (!positions.equals("Let the Force be with you")) {

            int[] jediPositions = readPositions(positions);
            int[] sithPositions = readPositions(scanner.nextLine());

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            int rowSith = sithPositions[0];
            int colSith = sithPositions[1];

            galaxy.moveSith(rowSith, colSith);
            starsPower += galaxy.moveJedi(rowJedi, colJedi);

            positions = scanner.nextLine();
        }

        System.out.println(starsPower);


    }

    private static boolean isBounds(int rowSith, int colSith, int[][] galaxy) {
        return rowSith >= 0 && rowSith < galaxy.length && colSith >= 0 && colSith < galaxy[rowSith].length;
    }

    private static int[] readPositions(String positions) {
        return Arrays.stream(positions.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
