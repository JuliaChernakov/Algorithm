import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class NumberOccurrencesTest {

    @Order(1)
    @Test
    void numberOccurrencesAlgorithmHappyPath() {
//    Test Data: {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} → {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}

        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void numberOccurrencesAlgorithmExcl() {

        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 6, 5, 3, 2, 1, 7, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {5, 4}};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void numberOccurrencesAlgorithmEmpty() {

        int[] array = {};
        int[][] expectedResult = {};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}