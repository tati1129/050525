package prof.homeworks._07_03_Lesson7.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IntegerList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 7, 2, 9, 5, 10, 3, 5, 7));
        int num = 9;

        removeGreaterThanNum(list, num);
        System.out.println("Измененный список: " + list);
    }

    public static void removeGreaterThanNum(List<Integer> list, int num) {
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next() > num) {
                iterator.remove();
            }
        }
    }

}
