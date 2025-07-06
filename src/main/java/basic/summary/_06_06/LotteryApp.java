package basic.summary._06_06;

import basic.summary._06_06.back.service.TicketService;
import basic.summary._06_06.back.repositiry.LotteryRepository;
import basic.summary._06_06.back.repositiry.PlayerRepository;
import basic.summary._06_06.back.repositiry.TicketRepository;
import basic.summary._06_06.back.service.LotteryService;
import basic.summary._06_06.back.service.PlayerService;
import basic.summary._06_06.front.UserInterface;

public class LotteryApp {
    public static void main(String[] args) {
        TicketRepository ticketRepository = new TicketRepository();
        LotteryRepository lotteryRepository = new LotteryRepository();
        PlayerRepository playerRepository = new PlayerRepository();

        TicketService ticketService = new TicketService(ticketRepository);
        LotteryService lotteryService = new LotteryService(lotteryRepository);
        PlayerService playerService = new PlayerService(playerRepository, ticketService);

        UserInterface userInterface = new UserInterface(lotteryService, playerService, ticketService);

        userInterface.menu();
    }
}
