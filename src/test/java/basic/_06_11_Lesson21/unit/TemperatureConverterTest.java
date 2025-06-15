package basic._06_11_Lesson21.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    void testcalsiusToFarenheitZero(){
        double tempCelsius = 0;

        assertEquals(32, TemperatureConverter.calsiusToFarenheit(tempCelsius));
    }

    @Test
    void testcalsiusToFarenheit100(){
        double tempCelsius = 0;

        assertEquals(212, TemperatureConverter.calsiusToFarenheit(tempCelsius));
    }

}