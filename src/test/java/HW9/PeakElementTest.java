package HW9;

import HW9.PeakElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class PeakElementTest {

    @Order(1)
    @Test
    void peakElementAlgorithmHappyPath() {
//    Test Data: {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void peakElementAlgorithmBorders() {

        int[] array = {3, 2, 7, 5, 1, 9, -5, 1};
        int[] expectedResult = {3, 7, 9, 1};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void peakElementAlgorithmEmpty() {

        int[] array = {};
        int[] expectedResult = {};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void peakElementAlgorithmSame() {

        int[] array = {3, 2, 7, 5, 1, 9, 9, 1};
        int[] expectedResult = {3, 7};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void peakElementAlgorithmAllSame() {

        int[] array = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] expectedResult = {};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}