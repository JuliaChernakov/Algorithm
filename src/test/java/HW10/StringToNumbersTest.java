package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumbersTest {

    @Test
    @Order(1)
    public void stringToNumbersHappyPath() {
        String string = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(string);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToNumbersEmpty() {
        String string = "";
        int[] expectedResult = {};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(string);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToNumbersNoLetters() {
        String string = "All you need is love";
        int[] expectedResult = {};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(string);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToNumbersBigNumbers() {
        String string = "254, 75";
        int[] expectedResult = {2, 5, 4, 7, 5};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbersAlgorithm(string);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}