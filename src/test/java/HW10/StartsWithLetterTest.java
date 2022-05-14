package HW10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartsWithLetterTest {

    @Test
    @Order(1)
    void startsWithLetterHappyPath() {

        String string = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        String expectedResult = "lame, love, lame, live, Look";

        StartsWithLetter sl = new StartsWithLetter();
        String actualResult = sl.StartsWithLetter(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void startsWithLetterNo() {

        String string = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made  by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my  engrafted to this store.\n" +
                "So then I am not , poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory .\n" +
                " what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        String expectedResult = "";

        StartsWithLetter sl = new StartsWithLetter();
        String actualResult = sl.StartsWithLetter(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void startsWithLetterEmpty() {

        String string = "";
        String expectedResult = "";

        StartsWithLetter sl = new StartsWithLetter();
        String actualResult = sl.StartsWithLetter(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}