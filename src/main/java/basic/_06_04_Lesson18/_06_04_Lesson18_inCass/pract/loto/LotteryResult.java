package basic._06_04_Lesson18._06_04_Lesson18_inCass.pract.loto;

import java.util.Arrays;

public class LotteryResult {
    private int WINNER_CRITERIA = 3;

    public void checkLotteryResult(Lottery lottery, Player player) {
        // провести проверку билетов игрока сравнив их с выигрышными номерами

        // получим выигрышные номера лотереи

        int[] winnerNumbers = lottery.getWinnerNumbers();

        Arrays.sort(winnerNumbers);

        // получаем билеты от игрока

        LotteryTicket[] playerTickets = player.getTickets();

        System.out.println("Результат проверки билетов для игрока: " + player.getIdCode());

        // проводим проверку КАЖДОГО билета

        for (int i = 0; i < playerTickets.length; i++) {
            // получим номера из текущего билета

            int[] numbersFromCurrentTicket = playerTickets[i].getTicketNumbers();

            int matchQuantity = checkTicketForWin(numbersFromCurrentTicket, winnerNumbers);

            if (matchQuantity > WINNER_CRITERIA) {
                System.out.println("Билет № " + i + " - выигрышный. Количество выигрышных номеров в билете = " + matchQuantity);
            }
        }
    }

    private int checkTicketForWin(int[] numbersFromCurrentTicket, int[] winnerNumbers) {

        int matchCounter = 0;

        for (int i = 0; i < numbersFromCurrentTicket.length; i++) {
            int currentNumberFromTicket = numbersFromCurrentTicket[i];
            if (Arrays.binarySearch(winnerNumbers, currentNumberFromTicket) >= 0) {
                matchCounter++;
            }
        }

        return matchCounter;

    }
}
