package basic._06_05_Lesson19.lotto_class.repository;

import basic._06_05_Lesson19.lotto_class.LotteryConfiguration;
import basic._06_05_Lesson19.lotto_class.entity.Player;

public class PlayerRepository {
    private Player[] players;
    private int playersCounter = 0;


    public PlayerRepository() {
        this.players =new Player[LotteryConfiguration.MAX_PLAYERS];
        this.playersCounter = 0;
    }

    public int getPlayersCounter() {
        return playersCounter;
    }

    public boolean  save(Player player){
        if (playersCounter < players.length){
            players[playersCounter++] = player;
            return true;
        }
        return false;
    }


    public Player findById(int idForSearch){
        for (int i = 0; i < playersCounter; i++) {
            if (players[i].getId() == idForSearch){
                return players[i];
            }
        }
        return null;
    }

}
