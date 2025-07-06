package prof.lessons._06_30_Lesson6.practice;

import java.util.*;

public class SetTask1 {
    public static void main(String[] args) {


        // исходный текст

        String text = "В Java, `enum` (или перечисление) используется для определения коллекции именованных констант. " +
                "Эти константы могут быть примитивными значениями или комплексными объектами. Использование `enum` " +
                "в Java помогает сделать код более читаемым и безопасным, поскольку оно ограничивает возможные значения " +
                "переменной до предопределённого набора.";

        // составить список всех уникальных слов из текста
        // обработать текст и убрать из исходного текста все 'лишние' символы (скобки, запятые)
        //

        String correctText = correctText(text);

        // создать массив ВСЕЗ слов из текста (разделитель - пробел)
        String[] arrText = correctText.split(" ");
        System.out.println(Arrays.toString(arrText));

        System.out.println("В текстке всего " + arrText.length + " слов");

        // из массива делаем коллекцию List в которую передаем все элементы массива

        List<String> listText = Arrays.asList(arrText);

        // используя данные из коллекции List создаем коллекцию Set в которой будут только уникальные слова

        Set<String> setText = new HashSet<>(listText);
        System.out.println("В тексте всего " + setText.size() + " уникальнызх слов");


    }

    private static String correctText(String text) {
        String correctText = text.toLowerCase();

        correctText = correctText.replace(",", "");
        correctText = correctText.replace("(", "");
        correctText = correctText.replace(")", "");
        correctText = correctText.replace(".", "");
        correctText = correctText.replace("`", "");
        return correctText;
    }
}
