package HW9;

import HW9.OddIndices;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesHappyPathEven() {
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result = {590, 985, 68}
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathOdd() {
//    Input = {-45, 590, 234, 985, 12, 68, -118}
//    Expected Result = {590, 985, 68}
        int[] array = {-45, 590, 234, 985, 0, 68, -118};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddIndicesZero() {
//    Input = {}
//    Expected Result = {}
        int[] array = {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddIndicesAllZero() {
//    Input = {0, 0, 0, 0, 0, 0, 0}
//    Expected Result = {0, 0, 0}
        int[] array = {0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}
