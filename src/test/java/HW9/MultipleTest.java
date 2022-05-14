package HW9;

import HW9.Multiple;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MultipleTest {

    @Order(1)
    @Test
    public void multipleAlgorithmHappyPathBoth() {

        int number = 15;
        String expectedResult = "Good number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void multipleAlgorithmHappyPathThree() {

        int number = 18;
        String expectedResult = "Bad number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void multipleAlgorithmHappyPathFive() {

        int number = 20;
        String expectedResult = "Poor number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void multipleAlgorithmNone() {

        int number = 8;
        String expectedResult = "-1";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(5)
    @Test
    public void multipleAlgorithmNegative() {

        int number = -15;
        String expectedResult = "Good number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multipleAlgorithmZero() {

        int number = 0;
        String expectedResult = "Good number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



