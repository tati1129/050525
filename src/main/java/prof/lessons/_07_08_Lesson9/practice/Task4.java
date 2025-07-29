package prof.lessons._07_08_Lesson9.practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
/*
        Из текста подсчитать количество вхождений для каждого слов
         */

        Set<String> words = new TreeSet<>();
        // TreeSet - чтобы сразу отсортировать по алфавиту


        String textSource =  "Java - это язык программирования. "
                + "Программирование на Java очень интересно! "
                + "Java разработка и язык программирования.";

        // преобразование исходного текста для дальнейшей обработки
      String text = textSource.toLowerCase();
      text = text.replace("-", "");
      text = text.replace(".", "");
      text = text.replace("!", "");
      text = text.replace("  ", " ");

      String[] wordsArray = text.split(" ");
        // из массива составляем коллекцию


        for (int i = 0; i < wordsArray.length; i++) {
            String currentWord = wordsArray[i];
            words.add(currentWord);

        }

        System.out.println(words);
    }
}
