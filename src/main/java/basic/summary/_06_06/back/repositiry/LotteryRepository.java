package basic.summary._06_06.back.repositiry;

import basic.summary._06_06.LotteryConfiguration;

import java.util.Random;

public class LotteryRepository {
    private int[] allNumbers;
    private int[] shuffledNumbers;
    private int[] winningNumbers;

    public LotteryRepository() {
        this.allNumbers = new int[LotteryConfiguration.LOTTERY_DIAPAZON];
        this.winningNumbers = new int[LotteryConfiguration.TICKET_SIZE];
    }

    public void makeLottery() {
        generateAllNumbers();
        shuffleNumbers();
        selectWinningNumbers();
    }

    private void generateAllNumbers() {
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = i + 1;
        }
    }

    private void shuffleNumbers() {
        shuffledNumbers = allNumbers.clone();
        Random random = new Random();
        for (int i = shuffledNumbers.length - 1; i > 0; i--) {
            int indexElemForChange = random.nextInt(i);

            int temp = shuffledNumbers[i];
            shuffledNumbers[i] = shuffledNumbers[indexElemForChange];
            shuffledNumbers[indexElemForChange] = temp;
        }
    }

    private void selectWinningNumbers() {
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = shuffledNumbers[i];
        }
    }


    public int[] getWinningNumbers() {
        return winningNumbers.clone();
    }
}
