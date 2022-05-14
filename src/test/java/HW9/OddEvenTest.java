package HW9;

import HW9.OddEven;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathNegative() {
//        -345 →  “Odd”
        int number = -345;
        String expectedResult = "Odd";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathZero() {
//        0 →  “Even”
        int number = 0;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathPositive() {
//        222222 →  “Even”
        int number = 222222;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenBig() {
//        2147483647 + 1 →  “Undefined”
        long number = 2147483647L + 1;
        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenSmall() {

        long number = -2147483648L - 1;
        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



