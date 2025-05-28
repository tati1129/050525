package _05_20_Lesson11.stringOperation;

public class WorkWithString3 {

    public static void main(String[] args) {
        String text = "Это текст для проверки работы методов класса String";

        System.out.println(text);

        System.out.println("=== проверка вхождения текста (набора символов) в строку ===");

        String myString = "проверк";

        boolean resultCheckContains = text.contains(myString);

        System.out.println("Contains result is - " + resultCheckContains);

        System.out.println("Contains word 'str' result is - " + text.contains("str"));

        System.out.println("======= перевод текста в большие или маленькие буквы");

        String textAfterUpperCase = text.toUpperCase();
        String textAfterLowerCase = text.toLowerCase();

        System.out.println(textAfterLowerCase);
        System.out.println(textAfterUpperCase);

        // проверим вхождение превратив текст в маленькие буквы

        System.out.println("Contains word 'str' result is - " + text.toLowerCase().contains("str"));
    }

}
