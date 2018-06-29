package bj;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Player> players;
    Player dealer = new Player("Dealer");

    public Game() {
        players = new ArrayList<Player>();

    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void startNewGame(int numDecks) {

    }

    public void dealRound() {

    }

}
