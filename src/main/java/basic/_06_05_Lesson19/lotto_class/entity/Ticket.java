package basic._06_05_Lesson19.lotto_class.entity;

import basic._06_05_Lesson19.lotto_class.LotteryConfiguration;
import basic._06_05_Lesson19.lotto_class.service.NumberGenerator;

public class Ticket {
    private static int nextTicketId = 1;
    private int ticketId;
    private int[] numbers;
    private int playerId;
    private int lottaryDiapazon;

    public Ticket() {
        this.ticketId = nextTicketId++;
        this.numbers = new int[LotteryConfiguration.TICKET_SIZE];
        this.lottaryDiapazon = LotteryConfiguration.LOTTERY_SIZE;

    }

    public void sellTicketPlayer(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int[] getNumbers() {
        return numbers.clone();
    }

    public int getTicketId() {
        return ticketId;
    }

    // необходимо создать метод для заполнения массива чисел этого билета
    // либо каким-то образом в него передать эти данные

    public void generateTicketNumbers() {
        int[] generated = NumberGenerator.generateRandomUniqueNumbers(lottaryDiapazon, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generated[i];
        }
    }
}
