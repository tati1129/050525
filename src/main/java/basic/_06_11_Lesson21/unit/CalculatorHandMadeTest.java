package basic._06_11_Lesson21.unit;

public class CalculatorHandMadeTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // исходные данные
        int x = 10;
        int y = 15;

        // ожидаемый результат
        int expectedResult = 25;

        // реальный результат (результат работы метода)

        int actualResult = calculator.sum(x,y);

        // ----------- test (compare result) ---------

        if (actualResult == expectedResult){
            System.out.println("Test OK!");
        } else {
            System.out.println("TEST FAILED!!!");
            System.out.println("Expected: " + expectedResult + ", but received :" + actualResult);
        }
    }
}
