package bj;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public String name;
    public Hand hand;
    public double bankRoll;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    public class Hand {

        public List<Card> hand;
        public int handTotal = 0;

        public Hand() {
            hand = new ArrayList<Card>();
        }

        public void getNewHand(Card cardOne, Card cardTwo) {
            this.hand = new ArrayList<Card>();
            this.hand.add(cardOne);
            this.hand.add(cardTwo);
            int handTotal = 0;
            for (Card card : hand) {
                if (handTotal > 10 && card.value.equals(Value.Ace)) {
                    handTotal += 1;
                } else {
                    handTotal += card.value.getValue();
                }
            }
            this.handTotal = handTotal;
        }

        public boolean checkIfBust() {
            if (this.handTotal > 21) {
                hand.clear();
                return true;
            }
            return false;
        }

        public void hit(Card card) {
            this.hand.add(card);
            System.out.println("You hit! You got a " + card.toString());
            this.addCardToTotal(card);
            boolean bust = this.checkIfBust();
            if (bust) {
                System.out.println("You busted");
            }
            else {
                System.out.println(hand.toString());
            }
        }

        public int getHandTotal() {
            return this.handTotal;
        }

        private void addCardToTotal(Card card) {
            if (this.handTotal > 10 && card.value.equals(Value.Ace)) {
                this.handTotal += 1;
            } else {
                this.handTotal += card.value.getValue();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.hand.isEmpty()) {
                return "No cards in the hand!";
            }
            for(Card card : hand) {
                sb.append(card.toString() + "\n");
            }
            sb.append("HandTotal = " +this.handTotal);
            return sb.toString();
        }

    }

}
