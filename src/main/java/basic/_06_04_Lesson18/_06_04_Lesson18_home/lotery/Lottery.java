package basic._06_04_Lesson18._06_04_Lesson18_home.lotery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    private int[] allLotteryNumbers;
    private int[] winnerNumbers;

    public int[] getLotteryNumbers() {
        return allLotteryNumbers;
    }

    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    public void createLotteryNumbers(int lotterySize) {
        allLotteryNumbers = new int[lotterySize];
        for (int i = 0; i < allLotteryNumbers.length; i++) {
            allLotteryNumbers[i] = (i + 1);
        }
    }

    public void shuffledNumbers() {
        Random random = new Random();

        for (int i = allLotteryNumbers.length - 1; i > 0; i--) {
            int rand = random.nextInt(i);
            int temp = allLotteryNumbers[i];
            allLotteryNumbers[i] = allLotteryNumbers[rand];
            allLotteryNumbers[rand] = temp;
        }
    }

    public void lotteryRound(int quantityWinnerNumbers) {
        winnerNumbers = new int[quantityWinnerNumbers];
        shuffledNumbers();

        for (int i = 0; i < winnerNumbers.length; i++) {
            winnerNumbers[i] = allLotteryNumbers[i];
        }
        Arrays.sort(winnerNumbers);
    }

    public void printWinnersNumbers() {
        System.out.print("Выиграшные номера : " + Arrays.toString(winnerNumbers));

        System.out.println();
    }

}
