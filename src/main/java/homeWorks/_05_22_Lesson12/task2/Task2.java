package homeWorks._05_22_Lesson12.task2;

public class Task2 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int num3 = (int) (Math.random() * 100);
        int num4 = (int) (Math.random() * 100);

        System.out.println("Случайные числа:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("Максимальное число: " + maxInt(num1, num2, num3, num4));

    }

    public static int maxInt(int num1, int num2, int num3, int num4) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        return max;
    }
}
