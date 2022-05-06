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

        int[] array = {1, 2, 3, 4, 12, 6, 7, 8};
        int a = 2;
        int b = 7;
        double[] expectedResult = {3, 12, 6.7};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveEmpty() {

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

        int[] array = {1, 2, 3, 4};
        int a = 0;
        int b = 3;
        double[] expectedResult = {1, 4, 2.5};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveIndexEqual() {

        int[] array = {1, 2, 3, 4};
        int a = 2;
        int b = 2;
        double[] expectedResult = {3, 3, 3};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveIndexZero() {

        int[] array = {0, 0, 0, 0};
        int a = 1;
        int b = 3;
        double[] expectedResult = {0, 0, 0};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveIndexChange() {

        int[] array = {1, 2, 3, 4, 5};
        int a = 3;
        int b = 1;
        double[] expectedResult = {2, 4, 3};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}