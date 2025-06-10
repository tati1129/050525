package basic._06_04_Lesson18._06_04_Lesson18_home.lotery;

import java.util.Arrays;

public class Player {
    private String idCode;
    private int numberTickets;
    private LotteryTicket[] tickets;

    public Player(String idCode, int numberTickets) {
        this.idCode = idCode;
        this.numberTickets = numberTickets;
        tickets = new LotteryTicket[numberTickets];
    }

    public String getIdCode() {
        return idCode;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public LotteryTicket[] getTickets() {
        return tickets;
    }

    public  void fillTickets(int sizeTicket, int sizeLotteryNumbers, boolean isRandom){

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new LotteryTicket();
            tickets[i].createAndFillTickets(sizeTicket,sizeLotteryNumbers,isRandom, i);
        }

    }
    public void printPlayerData(){

        System.out.println("Player ID : " + idCode);
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Билет номер : " + (i+1));
            System.out.println(Arrays.toString(tickets[i].getTicketNumbers()));
        }
    }
}
