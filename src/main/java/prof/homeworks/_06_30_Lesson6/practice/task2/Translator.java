package prof.homeworks._06_30_Lesson6.practice.task2;
/*
создайте словарь, где одному значению английского слова может соответсвовать несколько переводов
 */

import java.util.*;

public class Translator {
    public static void main(String[] args) {
        Map<String, List<String>> words = new HashMap<>();

        words.put("book", new ArrayList<>(Arrays.asList("книга", "издание", "том")));
        words.put("car", new ArrayList<>(Arrays.asList("машина", "автомобиль", "транспорт")));
        words.put("tree", new ArrayList<>(Arrays.asList("дерево", "растение", "лес")));
        words.put("school", new ArrayList<>(Arrays.asList("школа", "учебное заведение", "класс")));
        words.put("friend", new ArrayList<>(Arrays.asList("друг", "приятель", "товарищ")));
        words.put("dog", new ArrayList<>(Arrays.asList("собака", "пес", "питомец")));
        words.put("computer", new ArrayList<>(Arrays.asList("компьютер", "ПК", "вычислительное устройство")));
        words.put("house", new ArrayList<>(Arrays.asList("дом", "здание", "жилище")));

        System.out.println(words.entrySet());
        System.out.println("book -> " + words.get("book"));


    }
}
