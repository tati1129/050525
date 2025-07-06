package prof.lessons._06_30_Lesson6.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTask2 {
    public static void main(String[] args) {

 /*

        {1,2,3,4,5}
        {4,5,6,7,8}

        написать программу, которая будет сравнивать две коллекции Set и выводить на экран:
        - элементы, которые присутствуют ТОЛЬКО в первой коллекции: 1, 2, 3
        - элементы, которые присутствуют ТОЛЬКО во второй коллекции: 6, 7, 8
        - элементы, которые присутствуют в обеих коллекциях: 4, 5
         */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println();
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        /*
        для того, чтобы в uniqSet1 остались ТОЛЬКО унеикальные элементы этой коллекции
        - то есть элементы, которых нет в set2
        нам нужно пройтись по коллекции set2, взять каждый ее элемент и посмотреть - а есть ли они в uniqSet1

        если есть - то удалить
                */
        Set<Integer> uniqSet1 = new HashSet<>(set1);
        for (Integer elem : set2) {
            uniqSet1.remove(elem);
        }

        Set<Integer> uniqSet2 = new HashSet<>(set2);
        for (Integer elem : set1) {
            uniqSet2.remove(elem);
        }

        System.out.println("Уникальные элементы из первой коллекции: " + uniqSet1);

        System.out.println("Уникальные элементы из второй коллекции: " + uniqSet2);

//        Set<Integer> dublSet = new HashSet<>(set1);
//        for (Integer elem : uniqSet1){
//            dublSet.remove(elem);
//        }
//        System.out.println(dublSet);
        Set<Integer> commanSet = new HashSet<>();
        for (Integer currentElem : set1) {
            if (set2.contains(currentElem)) {
                commanSet.add(currentElem);
            }
        }

        System.out.println(commanSet);
    }
}
