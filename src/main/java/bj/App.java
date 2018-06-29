package bj;

public class App {

    public static void main(String[] args) {
        int numPlayers = 1;
        int numDecks = 1;
        double bet = 1.0;
        double blackJackPays = 1.5;

        Deck deck = new Deck();
        deck.shuffleDeck();
        //System.out.println(deck.toString());

        //Player omer = new HumanPlayer("Omer");
        //omer.hitOrStay(deck);
        Player dealer = new Dealer("Dealer");
        dealer.hand.getNewHand(deck.dealCard(), deck.dealCard());
        //System.out.println(dealer.hand.toString());
        dealer.hitOrStay(deck);
        //System.out.println(omer.hand.toString());




    }

    public static boolean dealerHitOrStay(int total) {
        if (total <= 16)
            return true;
        return false;
    }

    public static boolean bust(int total) {
        if (total > 21) {
            return true;
        }
        return false;
    }

    public static int aceValue(int total) {
        if (total <= 10) {
            return 11;
        }
        else return 1;
    }

    public static void hit() {

    }

    public static void split() {

    }

    public static void doubleDown() {

    }

    public static void dealCards() {

    }




}

