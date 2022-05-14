package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumbersAndSpacesTest {

    @Test
    @Order(1)
    public void stringToNumbersAndSpacesHappyPath() {

        String string = "орпа одйа8615 2346]123 4лрпср лучрлч3у8638-03] -3к8-/3";
        String expectedResult = " 8615 2346123 4 3863803 383";

        StringToNumbersAndSpaces sa = new StringToNumbersAndSpaces();
        String actualResult = sa.stringToNumbersAndSpacesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToNumbersAndSpacesNoNumbers() {

        String string = "орпаодйа]лрпсрлучрлчу-]-к-/";
        String expectedResult = "";

        StringToNumbersAndSpaces sa = new StringToNumbersAndSpaces();
        String actualResult = sa.stringToNumbersAndSpacesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToNumbersAndSpacesEmpty() {

        String string = "";
        String expectedResult = "";

        StringToNumbersAndSpaces sa = new StringToNumbersAndSpaces();
        String actualResult = sa.stringToNumbersAndSpacesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}