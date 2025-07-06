package prof.homeworks._06_26_Lesson5.task2.var2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrList {
    public static void main(String[] args) {
        LinkedList<Integer> list = fillLinkedListRandom();


        System.out.println(list);
        System.out.println("min = " + getMin(list));
        System.out.println("max = " + getMax(list));
        System.out.println("sortLinkedList(list) = " + sortLinkedList(list));


    }

    public static LinkedList<Integer> fillLinkedListRandom() {
        Random random = new Random();
        LinkedList<Integer> listRand = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < 100; i++) {

            int randInt = random.nextInt(100);
            listRand.add(index++, randInt);
        }
        return listRand;
    }

    public static int getMin(LinkedList<Integer> list) {
        int min = list.getFirst();
        for (Integer num : list) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static int getMax(LinkedList<Integer> list) {
        int max = 0;
        for (Integer num : list) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static LinkedList<Integer> sortLinkedList(LinkedList<Integer> list) {
        ArrayList<Integer> arrList = new ArrayList<>(list);
        for (int i = 0; i < arrList.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(j) < arrList.get(minIndex)) {
                    minIndex = j;

                }
            }
            int temp = arrList.get(i);
            arrList.set(i, arrList.get(minIndex));
            arrList.set(minIndex, temp);

        }
        return new LinkedList<>(arrList);
    }


}
