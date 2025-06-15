package basic._06_11_Lesson21.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 15;

        // ожидаемый результат
        int expectedResult = 35;

        // реальный результат (результат работы метода)

        int actualResult = calculator.sum(x,y);
assertEquals(expectedResult, actualResult);
    }
}