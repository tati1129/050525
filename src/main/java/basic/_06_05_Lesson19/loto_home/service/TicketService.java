package basic._06_05_Lesson19.loto_home.service;

import basic._06_05_Lesson19.loto_home.LotteryConfiguration;
import basic._06_05_Lesson19.loto_home.entity.Ticket;
import basic._06_05_Lesson19.loto_home.repositiry.TicketRepository;

public class TicketService {

    private TicketRepository ticketRepository = new TicketRepository();


    public void generateTicketsWithOutPlayers() {
        for (int i = 0; i < LotteryConfiguration.MAX_TICKETS; i++) {
            Ticket ticket = new Ticket();
            ticketRepository.saveTicket(ticket);
        }
    }

}
