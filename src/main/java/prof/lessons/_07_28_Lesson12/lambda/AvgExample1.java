package prof.lessons._07_28_Lesson12.lambda;

import java.util.Random;

public class AvgExample1 {
    public static void main(String[] args) {
        IAverage variableForLinkAnonymousClass = (a, b) -> (a + b) / 2;

        System.out.println("Наше среднее значение для чисел 5 и 9: " + variableForLinkAnonymousClass.avg(5, 9));



    IAverage variableForLink2 = (double a, double b) -> {
        Random random = new Random();
        int randomValue = random.nextInt(100);
        double result = (a + b) * randomValue / 75;
        return result;
    };
    System.out.println("Наше НОВОЕ среднее значение для 11 и 23 = "+variableForLink2);
}
}
