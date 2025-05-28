package homeWorks._05_28_Lesson15;

import java.util.Arrays;
import java.util.Random;

/*
        1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
        2.	Выведите его на консоль в строку.
        3.	Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        int[] array1 = {1,2,3,4,5,6,8};

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }
        System.out.println(Arrays.toString(array));

        System.out.println(isGrowing(array));
        System.out.println(isGrowing(array1));
    }
    public static boolean isGrowing(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (!(arr[i] < arr[i+1])){
                return false;
            }
        }
        System.out.println("Массив упорядочен в возрастающем порядке." + Arrays.toString(arr));
        return true;
    }
}
