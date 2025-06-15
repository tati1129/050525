package basic.homeWorks._06_11_Leson21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testCreateArrManuallySetArray() {

        service.array = new int[]{1,3,5,6,7,8};

        assertNotNull(service.array);
        assertArrayEquals(new int[]{1,3,5,6,7,8}, service.array);
    }

    @Test
    void createArrEvenElem() {
        service.array = new int[]{1,3,5,6,7,8};
        int[] expected  = new  int[]{6,8};
        int[] actual = service.createArrEvenElem();

        assertArrayEquals(expected,actual);
    }

    @Test
    void createAVG() {
        service.array = new int[]{1,3,5,6,7,8};

        double expected = 5.33;
        double actual = service.createAVG();
        double delta = 0.01;

        assertEquals(expected,actual,delta);
    }
}