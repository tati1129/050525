package basic.homeWorks._05_28_Lesson15;
import java.util.Arrays;
import java.util.Random;

/*
        1.  Создайте массив из 8 случайных целых чисел из интервала [1;50]
        2.	Выведите массив на консоль в строку.
        3.	Замените каждый элемент с нечетным индексом на ноль.
        4.	Снова выведете массив на консоль в отдельной строке.
 */

public class Task1 {
    public static void main(String[] args) {
        //Создайте массив из 8 случайных целых чисел из интервала [1;50]
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
