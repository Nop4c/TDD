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
		
		
		
	}
}
