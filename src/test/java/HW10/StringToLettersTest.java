package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class StringToLettersTest {

    @Test
    @Order(1)
    public void stringToLettersHappyPath() {

        String string = "орпа одйа86152346]1234лрпср лучрлч3у8638-03]-3к8-\3";
        String expectedResult = "орпаодйалрпсрлучрлчук";

        StringToLetters sa = new StringToLetters();
        String actualResult = sa.stringToLettersAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToLettersEmpty() {

        String string = "";
        String expectedResult = "";

        StringToLetters sa = new StringToLetters();
        String actualResult = sa.stringToLettersAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToLettersNoLetters() {

        String string = "97658 46525480-0987/!@#$%^ &*()))__[''][";
        String expectedResult = "";

        StringToLetters sa = new StringToLetters();
        String actualResult = sa.stringToLettersAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}