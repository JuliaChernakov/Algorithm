import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class MinMaxAveTest {

    @Order(1)
    @Test
    void testMinMaxAveHappyPathPositive() {
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        double[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    void testMinMaxAveHappyPathNegative() {
//        ({-1, 2, -3, 4, -5, 6, -7, 8}, 2, 6) →  {-7, 6, -1}
        int[] array = {-1, 2, -3, 4, -5, 6, -7, 8};
        int a = 2;
        int b = 6;
        double[] expectedResult = {-7, 6, -1};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveDouble() {
//        ({1, 2, 3, 4, 12, 6, 7, 8}, 2, 7) →  {3, 12, 6.7}
        int[] array = {1, 2, 3, 4, 12, 6, 7, 8};
        int a = 2;
        int b = 7;
        double[] expectedResult = {3, 12, 6.7};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveZero() {
//        ({}, 2, 6) →  {}
        int[] array = {};
        int a = 2;
        int b = 6;
        double[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveIndexOut() {
//        ({1, 2, 3, 4}, 2, 6) →  {}
        int[] array = {1, 2, 3, 4};
        int a = 2;
        int b = 6;
        double[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveIndexBorder() {
//        ({1, 2, 3, 4}, 0, 3) →  {1, 4, 2.5}
        int[] array = {1, 2, 3, 4};
        int a = 0;
        int b = 3;
        double[] expectedResult = {1, 4, 2.5};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}