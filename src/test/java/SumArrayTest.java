import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void sumArrayTestHappyPathPositive() {
//    {0, 1, 2, 3, 4, 5} → 15
        double[] array = {0, 1, 2, 3, 4, 5};
        double expectedResult = 15;

        SumArray sa = new SumArray();
        double actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void sumArrayTestHappyPathNegative() {
//    {-7, -3} → -10
        double[] array = {-7, -3};
        double expectedResult = -10;

        SumArray sa = new SumArray();
        double actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void sumArrayTestHappyPathPositiveNegative() {
//    {-7, -3, 0, 1, 2, 3, 4, 5} → 0
        double[] array = {-7, -3, 0, 1, 2, 3, 4};
        double expectedResult = 0;

        SumArray sa = new SumArray();
        double actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void sumArrayTestDouble() {
//    {1, 2, 3.569875, 4} → -10
        double[] array = {1, 2, 3.569875, 4};
        double expectedResult = 10.569875;

        SumArray sa = new SumArray();
        double actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void sumArrayTestEmpty() {
//    {} → Double.MIN_VALUE
        double[] array = {};
        double expectedResult = Double.MIN_VALUE;

        SumArray sa = new SumArray();
        double actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }





}
