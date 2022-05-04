import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class AreNumbersEqualTest {

    @Test
    @Order(1)
    public void areNumbersHappyPathEqual() {
        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void areNumbersHappyPathSmall() {
        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void areNumbersHappyPathBig() {
        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

        AreNumbersEqual ne = new AreNumbersEqual();
        int actualResult = ne.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
