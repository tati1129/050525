package basic._05_20_Lesson10.stringOperation;

public class WorkWithString1 {
    public static void main(String[] args) {
        String str1 = " ";
        String str2 = "";
        String text = "Это текст для проверки работы методов класса String";

        int myTextLength = text.length();

        System.out.println("Длина строки : " + myTextLength);

        boolean isMyStr1Empty = str1.isEmpty();
        System.out.println("Проверка строки на наличие любых символов : " + isMyStr1Empty);

        boolean isMyStr2Empty = str2.isEmpty();
        System.out.println("Проверка строки на наличие любых символов : " + isMyStr2Empty);

        boolean isMyStr1Blank = str1.isBlank();
        System.out.println("Проверка строки на наличие любых символов кроме пробела  : " + isMyStr1Blank);
        boolean isMyStr2Blank = str2.isBlank();
        System.out.println("Проверка строки на наличие любых символов кроме пробела : " + isMyStr2Blank);
    }
}
