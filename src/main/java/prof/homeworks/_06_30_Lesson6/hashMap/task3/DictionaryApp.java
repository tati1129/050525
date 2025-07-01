package prof.homeworks._06_30_Lesson6.hashMap.task3;

import prof.homeworks._06_30_Lesson6.UserInputStatic;

import java.util.HashMap;

/*
Словарь перевода слов:
Создайте HashMap, где ключом является слово на английском языке, а значением - его перевод
на другой язык.
Добавьте в словарь пять пар слов.
Выведите перевод слова, введенного пользователем.
Удалите слово из словаря и выведите обновленный список слов.
*/
public class DictionaryApp {
    public static void main(String[] args) {


        HashMap<String, String> words = new HashMap<>();

        words.put("Sun", "солнце");
        words.put("Window", "окно");
        words.put("Apple", "яблоко");
        words.put("Cap", "чашка");
        words.put("People", "люди");
        words.put("Summer", "лето");

        System.out.println("words = " + words);
        String userWord = UserInputStatic.inputText("Введите слово для перевода");
        System.out.println(userWord + " : " + words.get(userWord));

        words.remove("Apple");
        System.out.println("After removing words 'Apple' ");
        System.out.println("words = " + words);

    }

}
