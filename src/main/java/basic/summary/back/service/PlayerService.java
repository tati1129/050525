package basic.summary.back.service;

import basic.summary.back.entity.Player;
import basic.summary.back.repositiry.PlayerRepository;

public class PlayerService {
    private PlayerRepository playerRepository;
    private TicketService ticketService;

    public PlayerService(PlayerRepository playerRepository, TicketService ticketService) {
        this.playerRepository = playerRepository;
        this.ticketService = ticketService;
    }

    public Player registerPlayer(String name){
        Player player = new Player(name);
        boolean isSaved = playerRepository.save(player);
        if (isSaved){
            return player;
        }else {
            return null;
        }
    }

    public boolean sellTicketsToPlayer(Player player ,int quantityTicketsToSell){

        boolean sellResult = ticketService.sellTicketToPlayer(player.getId(), quantityTicketsToSell);
        return sellResult;
        }

    }


