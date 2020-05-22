package src.WorkingWithAbstractionExercises.CardsWithPower;


public class Card {
    private Rank type;
    private Suit suit;

    public Card(Rank type, Suit suit) {
        type = type;
        suit = suit;
    }


    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                type,
                suit, getPower());
    }

    private int getPower() {
        return type.getSumRank() + suit.getValue();

    }

    public Rank getType() {
        return type;
    }

    public Suit getSuit() {
        return suit;
    }
}
