import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Order(1)
    @Test
    public void sortArrayAlgorithmHappyPath() {
//    Test Data: {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
        int[] array = {4, 3, 7, 11, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 11, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayAlgorithmAllEqual() {

        int[] array = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        int[] expectedResult = {4, 4, 4, 4, 4, 4, 4, 4, 4};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayAlgorithmMinMax() {

        int[] array = {12, 5, 0, -8, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] expectedResult = {-2147483648, -8, 0, 5, 12, 2147483647};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayAlgorithmNull() {

        int[] array = {};
        int[] expectedResult = {};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
