package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
	
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();

		String actual = romanNumeral.convertToRoman(input);

		Assert.assertEquals(expected, actual);
	}
	@Test
	public void convertToRoman(){	
		RomanNumerals romanNumeral = new RomanNumerals();	
		Assert.assertEquals("I", romanNumeral.convertToRoman("1"));
		Assert.assertEquals("III", romanNumeral.convertToRoman("3"));
		Assert.assertEquals("IV", romanNumeral.convertToRoman("4"));
		Assert.assertEquals("V", romanNumeral.convertToRoman("5"));
		Assert.assertEquals("VII", romanNumeral.convertToRoman("7"));
		Assert.assertEquals("IX", romanNumeral.convertToRoman("9"));
		Assert.assertEquals("X", romanNumeral.convertToRoman("10"));
		Assert.assertEquals("XI", romanNumeral.convertToRoman("11"));
		Assert.assertEquals("XV", romanNumeral.convertToRoman("15"));
		Assert.assertEquals("XXV", romanNumeral.convertToRoman("25"));
		Assert.assertEquals("XXX", romanNumeral.convertToRoman("30"));
		Assert.assertEquals("XXVIII", romanNumeral.convertToRoman("28"));
		Assert.assertEquals("XXVI", romanNumeral.convertToRoman("26"));
		Assert.assertEquals("XLV", romanNumeral.convertToRoman("45"));
		Assert.assertEquals("LV", romanNumeral.convertToRoman("55"));
		Assert.assertEquals("LXV", romanNumeral.convertToRoman("65"));
		Assert.assertEquals("LXXV", romanNumeral.convertToRoman("75"));
		Assert.assertEquals("LXXXV", romanNumeral.convertToRoman("85"));
		Assert.assertEquals("XCV", romanNumeral.convertToRoman("95"));
	/*
	
		*/
		
	}
}
