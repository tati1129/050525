package basic.summary._06_06.back.service;

import basic.summary._06_06.LotteryConfiguration;
import basic.summary._06_06.back.entity.Ticket;
import basic.summary._06_06.back.repositiry.TicketRepository;

public class TicketService {

    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void generateTicketsWithOutPlayers() {
        for (int i = 0; i < LotteryConfiguration.MAX_TICKETS; i++) {
            Ticket ticket = new Ticket();
            ticketRepository.saveTicket(ticket);
        }
    }

    public boolean sellTicketToPlayer(int playerId, int quantityTicketsToSell) {
        boolean sellingResult = ticketRepository.sellTicket(playerId, quantityTicketsToSell);
        return sellingResult;
    }

    public int[] returnWinnerTicketsId(int[] winnerNumbers) {
        return ticketRepository.allWinnerTickets(winnerNumbers);
    }

    public void printWinnerTickets(int[] winnerTicketsId) {

        for (int i = 0; i < winnerTicketsId.length; i++) {
            int currentTicketId = winnerTicketsId[i];
            Ticket currentTicket = ticketRepository.getTicketById(currentTicketId);

            System.out.println(currentTicket);
            //System.out.println("Билет № " + currentTicket + ", номера билета: " + Arrays.toString(currentTicket.getNumbers()) + ", id игрока: " + currentTicket.getPlayerId());
        }
    }
}
