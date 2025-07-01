package prof.lessons._06_30_Lesson6.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTask2Alternative {
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

        Set<Integer> uniqSet1 = new HashSet<>();
        Set<Integer> uniqSet2 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();


        uniqSet1.addAll(set1);
        // в результате этого действия в uniqSet1 будут элементы {1,2,3,4,5}

        uniqSet1.removeAll(set2);
        //из элементов (1,2,3,4,5) будут пытаться удалить все элементы из (4,5,6,7,8)
        // останется: (1,2,3)

        uniqSet2.addAll(set2);
        uniqSet2.removeAll(set1);


        commonSet.addAll(set1);
        commonSet.addAll(set2);

        // после этого в commonSet будут ВСЕ элементы из set1 и set2, но даже если часть
        // элементов "дублируется" то в commonSet дубликатов не будет: (1,2,3,4,5,6,7,8)

        // удалим из этой коллекции все "УНИКАЛЬНЫЕ" элементы uniqSet1 и uniqSet2
        commonSet.removeAll(uniqSet1);
        commonSet.removeAll(uniqSet2);

        System.out.println("Уникальне элементы из первой коллекции: " + uniqSet1);

        System.out.println("Уникальные элементы из второй коллекции: " + uniqSet2);

        System.out.println("Общие элементы из двух коллекций: " + commonSet);

    }
}
