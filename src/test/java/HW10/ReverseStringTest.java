package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseStringAlgorithmHappyPath() {
        String string = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringAlgorithmEmpty() {
        String string = "";
        String expectedResult = "";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseStringAlgorithmSigns() {
        String string = "!@#$%^&*() 573 erth";
        String expectedResult = "htre 375 )(*&^%$#@!";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStringAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}