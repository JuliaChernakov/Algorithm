import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueTestHappyPathPositive() {
//        3333, 9999 → 9999
        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueTestHappyPathNegative() {
//        -3333, -9999 → -3333
        int number1 = -3333;
        int number2 = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueTestEqual() {
//        -3333, -3333 → -3333
        int number1 = -3333;
        int number2 = -3333;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueTestZero() {
//        0, -3333 → -3333
        int number1 = 0;
        int number2 = -3333;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
