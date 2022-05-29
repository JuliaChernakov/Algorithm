package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class LongestCommonSubstringTest {

    @Test
    @Order(1)
    void longestCommonSubstringAlgorithmHappyPath() {
        String str1 = "Smaze”";
        String str2 = "amazing";
        String str3 = "amazon";
        String expectedResult = "maz";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    void longestCommonSubstringAlgorithmLastLetter() {
        String str1 = "klsjfn";
        String str2 = "amazing";
        String str3 = "amazon";
        String expectedResult = "n";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    void longestCommonSubstringAlgorithmNo() {
        String str1 = "klsjf";
        String str2 = "amazing";
        String str3 = "amazon";
        String expectedResult = "";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void longestCommonSubstringAlgorithmBeginningSmallFirst() {
        String str1 = "mazal";
        String str2 = "shlimazl";
        String str3 = "amazing";
        String expectedResult = "maz";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void longestCommonSubstringAlgorithmBeginningSmallSecond() {
        String str1 = "shlimazl";
        String str2 = "mazal";
        String str3 = "amazing";
        String expectedResult = "maz";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void longestCommonSubstringAlgorithmEndSmallThird() {
        String str1 = "shlimazl";
        String str2 = "amazing";
        String str3 = "kamaz";
        String expectedResult = "maz";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void longestCommonSubstringAlgorithmEndBigThird() {
        String str1 = "mazal";
        String str2 = "amazing";
        String str3 = "superkamaz";
        String expectedResult = "maz";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void longestCommonSubstringAlgorithmTwo() {
        String str1 = "amldkjfmaz";
        String str2 = "amazing";
        String str3 = "superkamaz";
        String expectedResult = "maz";

        LongestCommonSubstring cs = new LongestCommonSubstring();
        String actualResult = cs.LongestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
