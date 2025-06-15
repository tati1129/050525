package basic._06_11_Lesson21.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LetterCounterFromTextTest {
    LetterCounterFromText counter= new LetterCounterFromText();

    @Test
    void testCountLetterEmptyText() {
        assertEquals(0,counter.countLetter(""));
    }

    @Test
    void testCountLetterZero() {
        assertEquals(0,counter.countLetter("DSKLHGLsjgkd"));
    }

//    @Test
//    void testCountLetterEmptyText() {
//        assertEquals(0,counter.countLetter(""));
//    }
}