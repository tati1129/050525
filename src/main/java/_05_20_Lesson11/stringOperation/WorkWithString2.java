package _05_20_Lesson11.stringOperation;

public class WorkWithString2 {
    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов класса String";

        System.out.println(text);

        System.out.println("Получение символа из строки по его индексу: ");

        char symbol1 = text.charAt(0);

        System.out.println("Первый символ  в нашем тексте: " + symbol1);

        System.out.println("10 символ  в нашем тексте: " + text.charAt(9));
        System.out.println("15 символ  в нашем тексте: " + text.charAt(14));
        System.out.println("48 символ  в нашем тексте: " + text.charAt(47));
        //System.out.println("52 символ  в нашем тексте: " + text.charAt(51));
        // выдает ошибку, потому что при длине строки 51 символ значение
        // индекса изменяется от 0 до 50

        //Получение подстроки (части текста) из целого
        System.out.println("Получение подстроки из целого текста");
        System.out.println("возможно либо начиная с какого-то индекса и ДО КОНЦА строки");
        System.out.println("либо начиная с одного индекса и до другого");

        String substrFomText1 = text.substring(29);

        String substrFomText2 = text.substring(0,15);

        System.out.println(substrFomText1);
        System.out.println(substrFomText2);


    }
}
