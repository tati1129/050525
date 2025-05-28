package _05_21_Lesson11.operators;

public class CondOperators2 {
    public static void main(String[] args) {

        System.out.println("Примеры результатов для логических выражений: ");

        int x = 10;

        System.out.println((x > 5) && (x < 15));
        /*
        сперва вычисляется результат логических выражений (сравнений)
        (x > 5) - дает true
        (x < 15) - дает true

        по сути мы должны вычислить результат вот такого выражение true && true

        результат = true
         */


        System.out.println((x < 0) || (x >= 10));
        // аналогично false || true => true


        System.out.println(!(x < 0)); // по аналогии x < 0 -> false, а отрицание !false = true
    }
}
