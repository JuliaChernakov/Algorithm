package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    @Order(1)
    void removeDuplicatesAlgorithmHappyPath() {
        String string = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void removeDuplicatesAlgorithmLastUnik() {
        String string = "AABBCCaabbccd";
        String expectedResult = "abcd";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    void removeDuplicatesAlgorithmSymbols() {
        String string = "967 598 (*^7tlkOIUT(*&^jh gkjh";
        String expectedResult = "tlkoiujhg";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void removeDuplicatesAlgorithmEmpty() {
        String string = "";
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void removeDuplicatesAlgorithmNull() {
        String string = null;
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.RemoveDuplicatesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}