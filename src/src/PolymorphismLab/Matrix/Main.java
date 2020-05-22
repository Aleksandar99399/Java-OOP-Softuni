package src.PolymorphismLab.Matrix;

import src.PolymorphismLab.Matrix.cards.Card;
import src.PolymorphismLab.Matrix.cards.GoldCard;

public class Main {
    public static void main(String[] args) {
        Card card=new GoldCard();
        System.out.println(card.discountedPrice(10.0));
    }
}
