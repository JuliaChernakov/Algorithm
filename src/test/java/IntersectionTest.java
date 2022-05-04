import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Order(1)
    @Test
    void intersectionAlgorithmHappyPathPositive() {
//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection is = new Intersection();
        int[] actualResult = is.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    void intersectionAlgorithmHappyPathNegative() {
//        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection is = new Intersection();
        int[] actualResult = is.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    void intersectionAlgorithmIncludesZero() {
//        {1, 2, 4, 0, 8, 9}, {8, -9, 0, 2} → {2, 0, 8}
        int[] array1 = {1, 2, 4, 0, 8, 9};
        int[] array2 = {8, -9, 0, 2};
        int[] expectedResult = {2, 0, 8};

        Intersection is = new Intersection();
        int[] actualResult = is.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void intersectionAlgorithmNoIntersection() {
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        Intersection is = new Intersection();
        int[] actualResult = is.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void intersectionAlgorithmZeroArray() {
//        {1, 2, 4, 5, 89}, {} → {}
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {};
        int[] expectedResult = {};

        Intersection is = new Intersection();
        int[] actualResult = is.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
