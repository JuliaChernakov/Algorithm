import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositive() {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathZero() {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegative() {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}