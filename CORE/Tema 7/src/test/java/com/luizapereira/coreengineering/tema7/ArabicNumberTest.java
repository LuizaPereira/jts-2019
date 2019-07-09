package com.luizapereira.coreengineering.tema7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArabicNumberTest {

    public ArabicNumber arabicNumber;

    @Before
    public void initialize() {
        arabicNumber = new ArabicNumber();
    }

    @Test
    public void testConvertArabicOneToRoman() {

        Assert.assertEquals("I", arabicNumber.convertToRoman(1));
    }

    @Test
    public void testConvertArabicTwoToRoman() {

        Assert.assertEquals("II", arabicNumber.convertToRoman(2));
    }

    @Test
    public void testConvertArabicThreeToRoman() {

        Assert.assertEquals("III", arabicNumber.convertToRoman(3));
    }

    @Test
    public void testConvertArabicFourToRoman() {

        Assert.assertEquals("IV", arabicNumber.convertToRoman(4));
    }

    @Test
    public void testConvertArabicFiveToRoman() {

        Assert.assertEquals("V", arabicNumber.convertToRoman(5));
    }

    @Test
    public void testConvertArabicSixToRoman() {

        Assert.assertEquals("VI", arabicNumber.convertToRoman(6));
    }

    @Test
    public void testConvertArabicSevenToRoman() {

        Assert.assertEquals("VII", arabicNumber.convertToRoman(7));
    }

    @Test
    public void testConvertArabicEightToRoman() {

        Assert.assertEquals("VIII", arabicNumber.convertToRoman(8));
    }

    @Test
    public void testConvertArabicNineToRoman() {

        Assert.assertEquals("IX", arabicNumber.convertToRoman(9));
    }

    @Test
    public void testConvertArabicTenToRoman() {

        Assert.assertEquals("X", arabicNumber.convertToRoman(10));
    }

    @Test
    public void testConvertArabicElevenToRoman() {

        Assert.assertEquals("XI", arabicNumber.convertToRoman(11));
    }

    @Test
    public void testConvertArabicTwelveToRoman() {

        Assert.assertEquals("XII", arabicNumber.convertToRoman(12));
    }

    @Test
    public void testConvertArabicThirteenToRoman() {

        Assert.assertEquals("XIII", arabicNumber.convertToRoman(13));
    }

    @Test
    public void testConvertArabicFourteenToRoman() {

        Assert.assertEquals("XIV", arabicNumber.convertToRoman(14));
    }

    @Test
    public void testConvertArabicFifteenToRoman() {

        Assert.assertEquals("XV", arabicNumber.convertToRoman(15));
    }

    @Test
    public void testConvertArabicSixteenToRoman() {

        Assert.assertEquals("XVI", arabicNumber.convertToRoman(16));
    }

    @Test
    public void testConvertArabicSeventeenToRoman() {

        Assert.assertEquals("XVII", arabicNumber.convertToRoman(17));
    }

    @Test
    public void testConvertArabicEighteenToRoman() {

        Assert.assertEquals("XVIII", arabicNumber.convertToRoman(18));
    }

    @Test
    public void testConvertArabicNineteenToRoman() {

        Assert.assertEquals("XIX", arabicNumber.convertToRoman(19));
    }

    @Test
    public void testConvertArabicTwentyToRoman() {

        Assert.assertEquals("XX", arabicNumber.convertToRoman(20));
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertNotValidArabicNumber(){

        arabicNumber.convertToRoman(Integer.parseInt("test"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNotValidNumber(){

        arabicNumber.convertToRoman(33);
    }
}
