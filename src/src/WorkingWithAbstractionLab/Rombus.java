package src.WorkingWithAbstractionLab;

import java.util.Scanner;

public class Rombus {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=n ; i++) {
            printSingleLineOfStars(n,i);

        }

        for (int i = n-1; i >=1 ; i--) {
            printSingleLineOfStars(n,i);
        }
    }

    private static void printSingleLineOfStars(int totalNumbersOfStars, int starsToPrint) {

        int leadingToSpaces=totalNumbersOfStars-starsToPrint;
        for (int i = 0; i < leadingToSpaces; i++) {
            System.out.print(" ");

        }
        for (int i = 0; i < starsToPrint; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

}
