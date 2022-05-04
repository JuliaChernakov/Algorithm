import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MultipleTest {

    @Order(1)
    @Test
    public void multipleAlgorithmBoth() {

        int number = 15;
        String expectedResult = "Good number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void multipleAlgorithmThree() {

        int number = 18;
        String expectedResult = "Bad number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void multipleAlgorithmFive() {

        int number = 20;
        String expectedResult = "Poor number";

        Multiple m = new Multiple();
        String actualResult = m.multipleAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void multipleAlgorithmNone() {

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



