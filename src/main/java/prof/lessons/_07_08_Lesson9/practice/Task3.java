package prof.lessons._07_08_Lesson9.practice;

import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
/*
        Из текста подсчитать количество вхождений для каждого слов
         */

        Map<String,Integer> words = new TreeMap<>();
        // TreeMap - чтобы сразу отсортировать по алфавиту


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
            if (words.containsKey(currentWord)){
                int currentWordValue = words.get(currentWord);
                words.put(currentWord, currentWordValue+1);
            }else {
                words.put(currentWord, 1);
            }
        }

        System.out.println(words);
    }
}
