package prof.lessons._08_06_Lesson16.javainputoutput.standart;

import java.util.Date;

public class StandartPrintMethods {
    public static void main(String[] args) {
         /*
        Методы печати, которые мы модем использовать для вывода результата:

        - print() - стандартный метод (не делает "перевод на новую строку")

        - println() - стандартный метод (в конце печати делает "перевод на новую строку")

        - printf() - позволяет при печати производить форматирование вывода

        Разделитель строк %n
        Логическое форматирование %b
        Форматирование строк %s
        Форматирование символов %c
        Форматирование целых чисел %d
        Форматирование не целочисленных значений %f
        Форматирование даты и времени %t and T
        Символы H, M, S отвечают за часы, минуты и секунды
        A выводит полный день недели.
        d форматирует двузначный день месяца.
        B для полного названия месяца.
        m форматирует двузначный месяц.
        Y выводит год в виде четырех цифр.
        y выводит две последние цифры года.

         */

        System.out.println("Перенос на новую строку");

        System.out.print("Печать без переноса");
        System.out.print(" строки");
        System.out.println(".");

        System.out.print("Строка 1 \n \tСтрока 2 \n");

        // =============

        System.out.printf("one%ntwo%nthree");

        System.out.println();

        System.out.printf("ID: %02d  %04d%n", 2, 25);

        System.out.printf("Name: %-20s  |  Age: %02d%n", "Ruslan", 32);

        System.out.printf("Name: %-20s  |  Age: %02d%n", "Alex", 32);


        System.out.printf("PI = %.4f", Math.PI);

        System.out.println();

        System.out.println("Примеры с датой");

        Date date = new Date();

        System.out.printf("часы %tH : минуты %tM : секунды %tS%n", date, date ,date);

        System.out.printf("%1$tA , %1$td %1$tB %1$tY %n" , date);
    }
}
