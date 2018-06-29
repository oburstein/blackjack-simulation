package bj;

public class Dealer extends Player {


    public Dealer(String name) {
        super(name);
    }

    public void hitOrStay(Deck deck) {
        System.out.println(this.name + "'s  hand is: \n" + this.hand.toString());
        while (!this.hand.checkIfBust() && this.hand.getHandTotal() <= 16) {
            //System.out.println(this.name + "'s  hand is: \n" + this.hand.toString());
            System.out.println(this.name + " hits!");
            this.hand.hit(deck.dealCard());
            if (this.hand.checkIfBust()) {
                System.out.println(this.name + "Busts!");
            } else if (this.hand.getHandTotal() > 16) {
                System.out.println(this.name + " stays!");
            }

        }
    }

    public Card dealerShows() {
        if (!this.hand.hasCards()) {
            return null;
        } else {
            return this.hand.showFirstCard();
        }
    }
}
