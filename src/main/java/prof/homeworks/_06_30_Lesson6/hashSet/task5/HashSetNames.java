package prof.homeworks._06_30_Lesson6.hashSet.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Уникальный набор имен:
Создайте HashSet для хранения имен.
Добавьте в набор десять имен, некоторые из которых могут повторяться.
Выведите количество уникальных имен в наборе.
Проверьте, содержит ли набор определенное имя.
*/
public class HashSetNames {
    public static void main(String[] args) {


        List<String> listNames = new ArrayList<>(Arrays.asList("Ann", "Uno", "Timoty", "Samanta", "Tina", "Tom", "Ann", "John", "Bill", "Tina"));
        System.out.println("Список с повторами: " + listNames);

        HashSet<String> names = new HashSet<>(listNames);
        System.out.println("Уникальные имена: " + names);

        System.out.println("Количество уникальных имён: " + names.size());

        System.out.println(names.contains("Содержит Ann? " + "Ann"));
        System.out.println(names.contains("Содержит Antony? " + "Antony"));

    }
}
