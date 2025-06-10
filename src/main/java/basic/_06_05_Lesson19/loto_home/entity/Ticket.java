package basic._06_05_Lesson19.loto_home.entity;


import basic._06_05_Lesson19.loto_home.LotteryConfiguration;
import basic._06_05_Lesson19.loto_home.service.NumberGenerator;

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

    private void  generateTicketNumbers(){
       int[] generared =  NumberGenerator.generateRandomUniqueNumbers(lotteryDiapazon, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generared[i];
        }
    }
}
