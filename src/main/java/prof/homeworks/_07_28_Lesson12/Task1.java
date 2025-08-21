package prof.homeworks._07_28_Lesson12;

import java.util.function.UnaryOperator;

/*
Напишите функциональный интерфейс для преобразования строки в верхний регистр.
 */
public class Task1 {
    public static void main(String[] args) {
        String str = "mkyj ölkjs lakj,kla-ö";

        UnaryOperator<String> strToUpperCase = str1 -> str.toUpperCase();

        System.out.println(strToUpperCase.apply(str));

    }


}
