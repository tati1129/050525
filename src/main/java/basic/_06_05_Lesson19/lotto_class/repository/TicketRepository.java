package basic._06_05_Lesson19.lotto_class.repository;

import basic._06_05_Lesson19.lotto_class.LotteryConfiguration;
import basic._06_05_Lesson19.lotto_class.entity.Ticket;

public class TicketRepository {
    private Ticket[] tickets;
    private int ticketCounter;

    public TicketRepository() {
        this.tickets = new Ticket[LotteryConfiguration.MAX_TICKETS];
        this.ticketCounter = 0;
    }

    public boolean saveTicket(Ticket ticket) {
        if (ticketCounter < tickets.length) {
            tickets[ticketCounter++] = ticket;
            return true;
        }
        return false;
    }

    public Ticket[] findTicketsByPlayer(int playerId) {
        int playerTicketCounter = 0;

        for (int i = 0; i < ticketCounter; i++) {
            if (tickets[i].getPlayerId() == playerId) {
                playerTicketCounter++;
            }
        }
        if (playerTicketCounter > 0) {
            Ticket[] payerTickets = new Ticket[playerTicketCounter];
            int playerTicketIndex = 0;

            for (int i = 0; i < ticketCounter; i++) {
                if (tickets[i].getPlayerId() == playerId) {
                    payerTickets[playerTicketIndex++] = tickets[i];
                }
            }
            return payerTickets;
        } else {
            return null;
        }
    }
}
