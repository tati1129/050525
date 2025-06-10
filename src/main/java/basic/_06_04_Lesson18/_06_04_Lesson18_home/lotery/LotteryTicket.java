package basic._06_04_Lesson18._06_04_Lesson18_home.lotery;

import java.util.Arrays;

public class LotteryTicket {


    private int[] ticketNumbers;

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }


    public void createAndFillTickets(int sizeTicket, int sizeLottery, boolean isRandom, int idTicket) {
        ticketNumbers = new int[sizeTicket];
        fillTicket(sizeLottery, isRandom, idTicket);
    }

    private void fillTicket(int sizeLottery, boolean isRandom, int idTicket) {
        SourceTicketNumbers source = new SourceTicketNumbers();

        for (int i = 0; i < ticketNumbers.length; i++) {

            boolean isNotFillCurrentNumber = true;
            int currentRandomValue = 0;

            while (isNotFillCurrentNumber) {
                currentRandomValue = source.receiveTicketNumber(isRandom, sizeLottery, idTicket, i);

                if (currentNumberNotRepeat(currentRandomValue)) {
                    ticketNumbers[i] = currentRandomValue;
                    isNotFillCurrentNumber = false;

                }
            }
        }

        Arrays.sort(ticketNumbers);
    }

    private boolean currentNumberNotRepeat(int checkNumber) {
        for (int i = 0; i < ticketNumbers.length; i++) {
            if (ticketNumbers[i] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}