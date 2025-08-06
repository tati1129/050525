package prof.lessons._08_06_Lesson16.javainputoutput.bytefilestream;

/*
демонстрирует, как строка на русском языке представляется в виде байтов в кодировке UTF-8,
 и как эти байты можно отобразить в шестнадцатеричном виде
 */
import java.nio.charset.StandardCharsets;

public class NotAsciiExample {
    public static void main(String[] args) {
        String text = "Привет";
        byte[] textAsByte = text.getBytes(StandardCharsets.UTF_8);
        //Метод getBytes(StandardCharsets.UTF_8) преобразует строку в массив байтов, согласно UTF-8 кодировке.
        //Каждая русская буква в UTF-8 кодируется 2 байтами, поэтому:
        //Привет → 6 букв → 12 байтов.


//        for (byte cur : textAsByte) {
//            int number = cur & 0xFF;
//            System.out.print(number + " ");
//        }
        //Перебирает каждый байт строки.
        //Оператор & 0xFF приводит byte (знак может быть -128..127) к положительному значению 0..255 (int).
        //Выводит байты в десятичном виде (например: 208 159 ...)


        for (byte b : textAsByte){
            System.out.printf("%02X ", b & 0xFF);
        }
        //Этот цикл делает то же самое, но:
        //System.out.printf("%02X ", b & 0xFF);
        //Форматированный вывод в шестнадцатеричном виде (%02X — 2 цифры, заглавные буквы).
        //Пример вывода:
        //D0 9F D1 80 D0 B8 D0 B2 D0 B5 D1 82
    }
}
