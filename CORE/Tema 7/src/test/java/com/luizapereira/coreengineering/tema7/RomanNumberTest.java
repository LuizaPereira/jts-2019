package com.luizapereira.coreengineering.tema7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest {

    RomanNumber romanNumber;

    @Before
    public void initialize() {

        romanNumber = new RomanNumber();
    }

    @Test
    public void testConvertRomanOneToArabic() {
        Assert.assertEquals(1, romanNumber.convertToArabic("I"));
    }

    @Test
    public void testConvertRomanTwoToArabic() {
        Assert.assertEquals(2, romanNumber.convertToArabic("II"));
    }

    @Test
    public void testConvertRomanThreeToArabic() {
        Assert.assertEquals(3, romanNumber.convertToArabic("III"));
    }

    @Test
    public void testConvertRomanFourToArabic() {
        Assert.assertEquals(4, romanNumber.convertToArabic("IV"));
    }

    @Test
    public void testConvertRomanFiveToArabic() {

        Assert.assertEquals(5, romanNumber.convertToArabic("V"));
    }

    @Test
    public void testConvertRomanSixToArabic() {
        Assert.assertEquals(6, romanNumber.convertToArabic("VI"));
    }

    @Test
    public void testConvertRomanSevenToArabic() {
        Assert.assertEquals(7, romanNumber.convertToArabic("VII"));
    }

    @Test
    public void testConvertRomanEightToArabic() {
        Assert.assertEquals(8, romanNumber.convertToArabic("VIII"));
    }

    @Test
    public void testConvertRomanNineToArabic() {

        Assert.assertEquals(9, romanNumber.convertToArabic("IX"));
    }

    @Test
    public void testConvertRomanTenToArabic() {
        Assert.assertEquals(10, romanNumber.convertToArabic("X"));
    }

    @Test
    public void testConvertRomanElevenToArabic() {
        Assert.assertEquals(11, romanNumber.convertToArabic("XI"));
    }

    @Test
    public void testConvertRomanTwelveToArabic() {

        Assert.assertEquals(12, romanNumber.convertToArabic("XII"));
    }

    @Test
    public void testConvertRomanThirteenToArabic() {
        Assert.assertEquals(13, romanNumber.convertToArabic("XIII"));
    }

    @Test
    public void testConvertRomanFourteenToArabic() {
        Assert.assertEquals(14, romanNumber.convertToArabic("XIV"));
    }

    @Test
    public void testConvertRomanFifteenToArabic() {
        Assert.assertEquals(15, romanNumber.convertToArabic("XV"));
    }

    @Test
    public void testConvertRomanSixteenToArabic() {
        Assert.assertEquals(16, romanNumber.convertToArabic("XVI"));
    }

    @Test
    public void testConvertRomanSeventeenToArabic() {

        Assert.assertEquals(17, romanNumber.convertToArabic("XVII"));
    }

    @Test
    public void testConvertRomanEighteenToArabic() {
        Assert.assertEquals(18, romanNumber.convertToArabic("XVIII"));
    }

    @Test
    public void testConvertRomanNineteenToArabic() {
        Assert.assertEquals(19, romanNumber.convertToArabic("XIX"));
    }

    @Test
    public void testConvertRomanTwentyToArabic() {

        Assert.assertEquals(20, romanNumber.convertToArabic("XX"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNotValidRomanNumber(){
        romanNumber.convertToArabic("5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNotValidNumber(){
        romanNumber.convertToArabic("S");
    }
}
