package bj;

public class Card {

    public Suit suit;
    public Value value;


    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return this.value + " of " + this.suit;
    }
}