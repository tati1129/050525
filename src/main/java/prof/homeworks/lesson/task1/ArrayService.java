package prof.homeworks.lesson.task1;

import prof.homeworks.UserInputStatic;

import java.util.Arrays;

public class ArrayService {

    public ArrayService() {
    }

    public int[] createArrayFromUserInput() {
        int size = UserInputStatic.inputInt("Введите размер массива");
        int[] arrayFromUser = new int[size];
        return new int[size];
    }

    public int[] fillArrayFromUserInput(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int num = UserInputStatic.inputInt("Введите целое число");
            arr[i] = num;
        }
        return arr;
    }

    public int[] sortReverse(int[] array){
        int[] sortedArr = new int[array.length];
        int index = 0;
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        for (int i = array.length-1; i >= 0; i--) {
            sortedArr[index++] = array[i];
        }
        return sortedArr;
    }



    public void printArr(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
