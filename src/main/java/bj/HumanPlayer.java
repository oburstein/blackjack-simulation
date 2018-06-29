package bj;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void hitOrStay() {
        System.out.println("Would you like to hit (h) or stay (s)?");
        Scanner scanner = new Scanner(System.in);
        String hitOrStay = scanner.nextLine();
        if (hitOrStay.equals("h")) {

        } else if (hitOrStay.equals("s")) {

        } else {
            System.out.println("bad choice");
        }

    }
}
