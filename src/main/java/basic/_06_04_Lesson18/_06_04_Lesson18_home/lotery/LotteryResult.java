package basic._06_04_Lesson18._06_04_Lesson18_home.lotery;

import java.util.Arrays;

public class LotteryResult {
    private int WINNER_CRITERIA = 3;

    public void checkLotteryResult(Lottery lottery, Player player) {

        int[] winnerNumber = lottery.getWinnerNumbers();

        Arrays.sort(winnerNumber);

        LotteryTicket[] playerTickets = player.getTickets();

        System.out.println("Результат проверки билетов для игрока: " + player.getIdCode());

        for (int i = 0; i < playerTickets.length; i++) {
            int[] numbersForCurrentTicket = playerTickets[i].getTicketNumbers();
            int matchQuantity = checkTicketForWin(numbersForCurrentTicket, winnerNumber);
            if (matchQuantity > WINNER_CRITERIA) {
                System.out.println("Билет номер " + i + " выиграшный!");
                System.out.println("Количество выигрышных номеров в билете = " + matchQuantity);
            }
        }
    }

    private int checkTicketForWin(int[] numbersFromCurrentTicket, int[] winnerNumber) {
        int matchCounter = 0;
        for (int i = 0; i < numbersFromCurrentTicket.length; i++) {
            int currentNumberFromTickets = numbersFromCurrentTicket[i];
            if (Arrays.binarySearch(winnerNumber, currentNumberFromTickets) >= 0) {
                matchCounter++;
            }
        }
        return matchCounter;
    }
}
