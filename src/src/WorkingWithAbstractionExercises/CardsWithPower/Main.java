package src.WorkingWithAbstractionExercises.CardsWithPower;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        String type=scanner.nextLine();
        String suit=scanner.nextLine();

        Card card=new Card(Rank.valueOf(type),Suit.valueOf(suit));
        System.out.println(card.toString());
    }
}
