package _05_26_Lesson13.forLoop;

public class ForDemo {
    public static void main(String[] args) {
        int summ = 0;

        for (int i = 0; i <= 10 ; i++) {
            summ += i;
        }
        System.out.println("Сумма чисел : " + summ);
    }
}
