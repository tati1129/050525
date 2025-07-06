package basic._06_05_Lesson19.lotto_class.service;

import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    public static int[] generateRandomUniqueNumbers(int lotteryDiapazon, int length) {
        Random random = new Random();
        int[] generated = new int[length];
        //чтобы заполнить нужен источник значениий

        for (int i = 0; i < length; i++) {

            boolean isNotFilCurentNumber = true;

            // до тех пор пока мы считаем, что текущий номер не заполнен делаем следующее:
            while (isNotFilCurentNumber) {
                //получаем очередное значение для текущего номера билета
                int currentRandomValue = random.nextInt(lotteryDiapazon) + 1;

                //проверяем, если уже среди ранее введенных номеров такое значение
                //если да, то повторно запрашиваем номер, если нет - сораняем полученное значение в текущую ячейку массива и переходим в следующее
                if (isCurrentNumberNotRepeat(currentRandomValue, generated)) {
                    generated[i] = currentRandomValue;
                    isNotFilCurentNumber = false;
                }
            }
        }
        // отсортируем массив значений по возрастанию
        Arrays.sort(generated);
        return generated;
    }

    private static boolean isCurrentNumberNotRepeat(int checkNumber, int[] generated) {
        for (int i = 0; i < generated.length; i++) {
            if (generated[i] == checkNumber) {
                return false;
            }

        }
        return true;
    }
}
