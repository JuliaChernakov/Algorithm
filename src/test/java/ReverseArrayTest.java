import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Order(1)
    @Test
    void reverseArrayAlgorithmHappyPath() {
//    Test Data: {2, 7, 3, 10} → {10, 3, 7, 2}
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void reverseArrayAlgorithmOne() {
//    Test Data: {10} → {10}
        int[] array = {10};
        int[] expectedResult = {10};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void reverseArrayAlgorithmZero() {
//    Test Data: {} → {}
        int[] array = {};
        int[] expectedResult = {};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
