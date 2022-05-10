import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Order(1)
    @Test
    public void kthLargestAlgorithmHappyPath() {
//        Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9

        int array[] = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kl = new KthLargest();
        int actualResult = kl.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void kthLargestAlgorithmZero() {

        int array[] = {};
        int k = 3;
        int expectedResult = -2147483648;

        KthLargest kl = new KthLargest();
        int actualResult = kl.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void kthLargestAlgorithmBigger() {

        int array[] = {1, 2};
        int k = 3;
        int expectedResult = -2147483648;

        KthLargest kl = new KthLargest();
        int actualResult = kl.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}