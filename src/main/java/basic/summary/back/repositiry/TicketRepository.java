package basic.summary.back.repositiry;

import basic.summary.LotteryConfiguration;
import basic.summary.back.entity.Ticket;

public class TicketRepository {

    private Ticket[] tickets;
    private int ticketCounter;
    private int ticketSellingCounter;

    public TicketRepository() {
        this.tickets = new Ticket[LotteryConfiguration.MAX_TICKETS];
        this.ticketCounter = 0;
        this.ticketSellingCounter = 0;

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

    public Ticket getTicketById(int ticketId){
        return tickets[ticketId];
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

    public boolean sellTicket(int playerId, int quantityTicketsToSell) {
        if (ticketSellingCounter + quantityTicketsToSell <= tickets.length) {

            for (int i = ticketSellingCounter; i < (ticketSellingCounter + quantityTicketsToSell); i++) {
                tickets[i].setPlayerId(playerId);
            }
            ticketSellingCounter = ticketSellingCounter + quantityTicketsToSell;
            return true;
        } else {
            return false;
        }
    }


    public int[] allWinnerTickets(int[] winnerNumbers) {
        int[] winnerTicketsId = new int[LotteryConfiguration.MAX_TICKETS];
        int winTicketCounter = 0;

        for (int i = 0; i < ticketSellingCounter; i++) {
            if (checkTicketForWin(i, winnerNumbers)) {
                winnerTicketsId[winTicketCounter++] = tickets[i].getTicketId();
            }
        }

        int[] result = new int[winTicketCounter];

        for (int i = 0; i < winTicketCounter; i++) {
            result[i] = winnerTicketsId[i];
        }
        return result;
    }

    private boolean checkTicketForWin(int indexTicket, int[] winnerNumbers) {
        int matches = 0;
        int[] ticketsNumbers = tickets[indexTicket].getNumbers();

        for (int i = 0; i < winnerNumbers.length; i++) {
            for (int j = 0; j < ticketsNumbers.length; j++) {
                if (winnerNumbers[i] == ticketsNumbers[j]) {
                    matches++;
                }
            }
        }
        if (matches > LotteryConfiguration.MIN_MATCHES) {
            return true;
        } else {
            return false;
        }
    }

}

