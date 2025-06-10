package basic._06_05_Lesson19.loto_home.repositiry;

import basic._06_05_Lesson19.loto_home.LotteryConfiguration;
import basic._06_05_Lesson19.loto_home.entity.Ticket;

public class TicketRepository {

    private Ticket[] tickets;
    private int ticketCounter;

    public TicketRepository() {
        this.tickets = new Ticket[LotteryConfiguration.MAX_TICKETS];
        this.ticketCounter = 0;
    }

    public int getTicketCounter() {
        return ticketCounter;
    }

    public boolean saveTicket(Ticket ticket) {
        if (ticketCounter < tickets.length) {
            tickets[ticketCounter++] = ticket;
            return true;
        }
        return false;
    }

    public Ticket[] findTicketByPlayerId(int playerId) {
        int playerTicketCounter = 0;

        for (int i = 0; i < ticketCounter; i++) {
            if (tickets[i].getPlayerId() == playerId) {
                playerTicketCounter++;
            }
        }

        if (playerTicketCounter > 0) {
            Ticket[] playerTickets = new Ticket[playerTicketCounter];
            int playerTicketsIndex = 0;// индексс для новго массива найденых билетов по playerId

            for (int i = 0; i < ticketCounter; i++) {
                if (tickets[i].getPlayerId() == playerId) {
                    playerTickets[playerTicketsIndex++] = tickets[i];
                }

            }
            return playerTickets;
        } else {
            return null;

        }
    }
}

