package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumbersTest {

    @Test
    @Order(1)
    public void stringToNumbersHappyPath() {

        String string = "орпа одйа86152346]1234лрпср лучрлч3у8638-03]-3к8-/3";
        String expectedResult = "8615234612343863803383";

        StringToNumbers sa = new StringToNumbers();
        String actualResult = sa.stringToNumbersAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(1)
    public void stringToNumbersNoNumbers() {

        String string = "орпа одйалрпср лучрлч _)*&)(*&T &^$%";
        String expectedResult = "";

        StringToNumbers sa = new StringToNumbers();
        String actualResult = sa.stringToNumbersAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(1)
    public void stringToNumbersEmpty() {

        String string = "";
        String expectedResult = "";

        StringToNumbers sa = new StringToNumbers();
        String actualResult = sa.stringToNumbersAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}