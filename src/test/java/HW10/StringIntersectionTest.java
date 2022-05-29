package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIntersectionTest {

    @Test
    @Order(1)
    void stringIntersectionAlgorithmHappyPathBegin() {
        String str1 = "Carrot”";
        String str2 = "carwash";
        String expectedResult = "car";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    void stringIntersectionAlgorithmHappyPathMiddle() {
        String str1 = "Schmooze”";
        String str2 = "Noob";
        String expectedResult = "oo";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    void stringIntersectionAlgorithmLastLetter() {
        String str1 = "klsjfn";
        String str2 = "amazing";
        String expectedResult = "n";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void stringIntersectionAlgorithmNo() {
        String str1 = "klsjf";
        String str2 = "amazing";
        String expectedResult = "";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    void stringIntersectionAlgorithmEmpty() {
        String str1 = "";
        String str2 = "amazing";
        String expectedResult = "";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



