package prof.homeworks._06_26_Lesson5.task2.var1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListRandom {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> integers = new LinkedList<>();

        int elem = 0;

        while (integers.size()<100) {
            int rand = random.nextInt(100);
            if ( !integers.contains(rand)){
                integers.add(rand);
            }
        }
        System.out.println(integers);
        Collections.sort(integers);
        int min = integers.get(0);
        int max = integers.get(integers.size()-1);
        System.out.println(integers);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
