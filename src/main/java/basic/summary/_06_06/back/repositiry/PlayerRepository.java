package basic.summary._06_06.back.repositiry;

import basic.summary._06_06.LotteryConfiguration;
import basic.summary._06_06.back.entity.Player;

public class PlayerRepository {

    private Player[] players;
    private int playersCounter;

    public PlayerRepository() {
        this.players = new Player[LotteryConfiguration.MAX_PLAYERS];
        this.playersCounter = 0;
    }

    public int getPlayersCounter() {
        return playersCounter;
    }

    public boolean save(Player player) {
        if (playersCounter < players.length) {
            players[playersCounter++] = player;
            return true;
        }
        return false;
    }

    public Player findById(int idForSearch) {
        for (int i = 0; i < playersCounter; i++) {
            if (players[i].getId() == idForSearch) {
                return players[i];
            }
        }
        return null;
    }

}
