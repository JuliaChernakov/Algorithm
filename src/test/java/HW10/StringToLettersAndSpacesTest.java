package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToLettersAndSpacesTest {

    @Test
    @Order(1)
    void stringToLettersAndSpacesHappyPath() {

        String string = "орпа одйа 86152346]1234лрпс рлуч рлч3у8638-03]-3к 8-\3";
        String expectedResult = "орпа одйа лрпс рлуч рлчук ";

        StringToLettersAndSpaces ss = new StringToLettersAndSpaces();
        String actualResult = ss.stringToLettersAndSpacesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void stringToLettersAndSpacesNoLetters() {

        String string = "9765846525480-0987/!@#$%^&*()))__[''][";
        String expectedResult = "";

        StringToLettersAndSpaces ss = new StringToLettersAndSpaces();
        String actualResult = ss.stringToLettersAndSpacesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void stringToLettersAndSpacesEmpty() {

        String string = "";
        String expectedResult = "";

        StringToLettersAndSpaces ss = new StringToLettersAndSpaces();
        String actualResult = ss.stringToLettersAndSpacesAlgorithm(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}