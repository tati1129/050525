package basic._06_05_Lesson19.lotto_class.repository;

import basic._06_05_Lesson19.lotto_class.LotteryConfiguration;

import java.util.Random;

public class LotteryRepository {
    private int[] allNumbers;
    private int[] shuffeledNumbers;
    private int[] winningNumbers;

    public LotteryRepository() {
        this.allNumbers = new int[LotteryConfiguration.LOTTERY_SIZE];
        this.shuffeledNumbers = new int[LotteryConfiguration.LOTTERY_SIZE];
        this.winningNumbers = new int[LotteryConfiguration.TICKET_SIZE];
    }

    public void makeLottery(){
        generateAllNumbers();
        shuffleNumbers();
        selectWinningNumbers();
    }

    //генерируем и заполняем массив числами от 1 до 36
    private void generateAllNumbers(){
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = i+1;
        }
    }


    //перемешиваем номера
    private  void shuffleNumbers(){
        shuffeledNumbers = allNumbers.clone();
        Random random = new Random();
        for (int i = shuffeledNumbers.length; i >0 ; i--) {
            int indexElementForChange = random.nextInt(i);
            int temp = shuffeledNumbers[indexElementForChange];
            shuffeledNumbers[indexElementForChange] = temp;

        }
    }
//находим и заполняем массив номерами которые выигрышные(результат) выбирает первые 5
    private void selectWinningNumbers(){
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = shuffeledNumbers[i];
        }
    }

    //печатаем выигрышные номера
    public void printWinnersNumbers(){
        System.out.println("");

        for (int i = 0; i <winningNumbers.length ; i++) {
            System.out.print( winningNumbers[i] + " , ");
        }
        System.out.println();
    }

    //возвращаем массив выигрышных номеров склонированным массивом
    public int[] getWinningNumbers(){
        return winningNumbers.clone();
    }

}
