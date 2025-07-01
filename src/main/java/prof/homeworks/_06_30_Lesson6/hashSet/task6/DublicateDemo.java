package prof.homeworks._06_30_Lesson6.hashSet.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Удаление дубликатов из списка:
Создайте ArrayList с дублирующимися элементами.
Преобразуйте ArrayList в HashSet, чтобы автоматически удалить дубликаты.
Выведите новый список без дубликатов.
Добавьте новые элементы в HashSet и снова преобразуйте его обратно в ArrayList.
 */
public class DublicateDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("water", "earth", "stone", "sand", "earth", "water", "air", "sun", "air", "sand", "sun"));

        System.out.println("Общее количество слов : " + strings.size());

        HashSet<String> stringHashSet = new HashSet<>(strings);
        System.out.println("Hовый список без дубликатов : " + stringHashSet);
        System.out.println("Kоличество слов без дубликатов : " + stringHashSet.size());

        stringHashSet.add("wind");
        stringHashSet.add("cloud");
        stringHashSet.add("stars");
        stringHashSet.add("stars");

        System.out.println(stringHashSet);
        System.out.println(stringHashSet.size());
        strings.addAll(stringHashSet);


//        strings = new ArrayList<>(stringHashSet);
        System.out.println("Новый список : " + strings);
        System.out.println("Новый список размером : " + strings.size());


    }
}
