package basic.summary._06_06.back.entity;


import basic.summary._06_06.LotteryConfiguration;
import basic.summary._06_06.back.service.NumberGenerator;

import java.util.Arrays;

public class Ticket {
    private static int nextTicketId;
    private  int ticketId; //идентификатор 1билета у пользователя
    private  int[] numbers; //номера в билете
    private int playerId; //идентификатор пользователя
    private int lotteryDiapazon; //

    public Ticket() {
        this.ticketId = nextTicketId++;
        this.numbers = new int[LotteryConfiguration.TICKET_SIZE];
        this.lotteryDiapazon = LotteryConfiguration.LOTTERY_DIAPAZON;
        generateTicketNumbers();
    }

    public void sellTicketPlayer(int playerId){
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int[] getNumbers() {
        return numbers.clone();
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    private void  generateTicketNumbers(){
       int[] generared =  NumberGenerator.generateRandomUniqueNumbers(lotteryDiapazon, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generared[i];
        }
    }

    @Override
    public String toString() {
        return "Ticket { " +
                "ticketId = " + ticketId +
                ", numbers = " + Arrays.toString(numbers) +
                ", playerId = " + playerId +
                ", lotteryDiapazon = " + lotteryDiapazon +
                "  }";
    }

}
