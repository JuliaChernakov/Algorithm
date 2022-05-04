import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {

    @Order(1)
    @Test
    public void sumOfTwoAlgorithmHappyPath() {
//        Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}

        int array[] = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sumOfTwoAlgorithmTwoSame() {

        int array[] = {4, 3, 7, 12, 5, 2, 9, 4, 12, 0};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}, {12, 0}, {12, 0}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sumOfTwoAlgorithmZero() {

        int array[] = {};
        int n = 12;
        int[][] expectedResult = {};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.SumOfTwoAlgorithm(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}