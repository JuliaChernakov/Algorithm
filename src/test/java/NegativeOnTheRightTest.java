import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeOnTheRightTest {

    @Order(1)
    @Test
    public void negativeOnTheRightAlgorithmHappyPath() {
//        Test Data: {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeOnTheRightAlgorithmEmpty() {

        int[] array = {};
        int[] expectedResult = {};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeOnTheRightAlgorithmAllNegative() {

        int[] array = {-1, -2, -4};
        int[] expectedResult = {-1, -2, -4};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}