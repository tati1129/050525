package basic._06_05_Lesson19.loto_home.service;

import basic._06_05_Lesson19.loto_home.entity.Player;
import basic._06_05_Lesson19.loto_home.repositiry.PlayerRepository;

public class PlayerService {
    private PlayerRepository playerRepository = new PlayerRepository();

    public boolean registerPlayer(String name) {
        Player player = new Player(name);
        boolean isSaved = playerRepository.save(player);
        return isSaved;
    }
}
