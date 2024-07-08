package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;


import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
        void sumTest() {
            assertEquals(4, sum(2,2));

        }

    @Test
        void multiplyTest() {
            assertEquals(8, multiply(4,2));

        }

    @Test
        void divideTest() {
            assertEquals(4, divide(16,4));
            assertEquals(0, divide(16,0));
        }

    @Test
        void subtractTest() {
            assertEquals(12, subtract(16,4));
        }

    @Test
        void sumOfDigitsTest() {
            assertEquals(12, sumOfDigits(165));
        }

    @Test
        void maxDigitTest() {
            assertEquals(9, maxDigits(2945));
        }
    
    @Test
        void isDevidedOnTest () {
            assertEquals(true, isDevidedOn(350, 10));
        }

}
