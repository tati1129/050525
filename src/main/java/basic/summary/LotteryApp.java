package basic.summary;

import basic.summary.back.service.TicketService;
import basic.summary.back.repositiry.LotteryRepository;
import basic.summary.back.repositiry.PlayerRepository;
import basic.summary.back.repositiry.TicketRepository;
import basic.summary.back.service.LotteryService;
import basic.summary.back.service.PlayerService;
import basic.summary.front.UserInterface;

public class LotteryApp{
    public static void main(String[] args) {
        TicketRepository ticketRepository = new TicketRepository();
        LotteryRepository lotteryRepository = new LotteryRepository();
        PlayerRepository playerRepository = new PlayerRepository();

        TicketService ticketService = new TicketService(ticketRepository);
        LotteryService lotteryService = new LotteryService(lotteryRepository);
        PlayerService playerService = new PlayerService(playerRepository,ticketService);

        UserInterface userInterface = new UserInterface(lotteryService,playerService,ticketService);

        userInterface.menu();
    }
}
