package basic._06_05_Lesson19.loto_home.service;

import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {
    public static int[] generateRandomUniqueNumbers(int lotteryDiapazon, int length) {
        Random random = new Random();
        int[] generated = new int[length];


        for (int i = 0; i < length; i++) {
            boolean isNotFillCurrentNumber = true;

            while (isNotFillCurrentNumber) {
                int currentRandomValue = random.nextInt(lotteryDiapazon) + 1;

                if (iscurrentNumberNotRepeat(currentRandomValue, generated)) {
                    generated[i] = currentRandomValue;
                    isNotFillCurrentNumber = false;
                }
            }
        }
        Arrays.sort(generated);
        return generated;
    }

    private static boolean iscurrentNumberNotRepeat(int checkNumber, int[] generated) {
        for (int i = 0; i < generated.length; i++) {
            if (generated[i] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}
