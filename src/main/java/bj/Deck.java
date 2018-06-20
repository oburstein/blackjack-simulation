package bj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private int numDecks;
    List<Card> deckOfCards;

    public Deck() {
        this.numDecks = 1;
        deckOfCards = generateDeck(numDecks);
    }

    public Deck(int numDecks) {
        this.numDecks = numDecks;
        deckOfCards = generateDeck(numDecks);
    }

    private List<Card> generateDeck(int numDecks) {
        List<Card> deckOfCards = new ArrayList<Card>();
        for (int i = 1; i <= numDecks; i++) {
            for (Suit suit : Suit.values()) {
                for (Value value : Value.values()) {
                    deckOfCards.add(new Card(suit, value));
                }
            }
        }
        return deckOfCards;
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public Card dealCard() {
       if (!deckOfCards.isEmpty()) {
           return deckOfCards.remove(0);
       }
       return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (deckOfCards.isEmpty()) {
            return "No cards in the deck!";
        }
        for (Card c : deckOfCards) {
            sb.append(c.toString()+"\n");
        }
        return sb.toString();
    }

}
