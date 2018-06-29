package bj;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void hitOrStay(Deck deck) {
         while (!this.hand.checkIfBust()) {
            System.out.println(this.name + "'s  hand is: \n" + this.hand.toString());
            System.out.println("Would you like to hit (h) or stay (s)?");
            Scanner scanner = new Scanner(System.in);
            String hitOrStay = scanner.nextLine();
            if (hitOrStay.equals("h")) {
                this.hand.hit(deck.dealCard());
            } else if (hitOrStay.equals("s")) {
                System.out.println("You chose to stay");
            } else {
                System.out.println("bad choice");
            }
        }

    }
}
