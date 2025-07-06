package prof.lessons._06_30_Lesson6.hasnSet.aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        Set<Integer> integers = new HashSet<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(5);
//        integers.add(7);
//        integers.add(9);
//        integers.add(1);
//        integers.add(5);
//
//        System.out.println("integers = " + integers);

          /*
        создайте коллекцию list, содержащую только уникальные элементы
         */
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("One");
        strings.add("Three");
        strings.add("Four");
        strings.add("Four");
        strings.add("Five");

        System.out.println("strings = " + strings);

        // -------------- создадим коллекцию list и наполним ее уникальными элемента
        List<String> newListUniq = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String currentElem = strings.get(i);
            if (!newListUniq.contains(currentElem)) {
                newListUniq.add(currentElem);
            }
        }

        System.out.println("newListUniq = " + newListUniq);


        // ------------- альтернативный вариант -----------------
        /*
        пройтись по коллекции lis и добавить каждый ее элемент в set
        если токого элемента еще нет, то он добавится, а если уже есть,
        то проигнорируется (автоматически)

        создаем итоговую коллекцию list куда передаем все элементы из set
         */

//        Set<String> setUniq = new HashSet<>();
//
//        for (int i = 0; i < strings.size(); i++) {
//            setUniq.add(strings.get(i));
//        }

        // вариант № 3 - метод addAll() - который пытается добавить в нашу
        // коллекцию set ВСЕ элементы из другой коллекции

//        Set<String> setUniq = new HashSet<>();
//        setUniq.addAll(strings);

        Set<String> setUniq = new HashSet<>();
//        for (int i = 0; i < strings.size(); i++) {
//            setUniq.add(strings.get(i));
//        }
//
//        System.out.println("hashSet = " + setUniq);
//
//        List<String> newListUniqResult = new ArrayList<>(setUniq);
//
//        System.out.println("newListUniqResult = " + newListUniqResult);

        setUniq.addAll(strings);

        Set<String> setUniq1 = new HashSet<>(strings);
        List<String> list = new ArrayList<>(setUniq1);

    }
}
