import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class StringCalculatorTest {

	//		  INPUTS				EXPECTED OUTPUT
	//		  ""						"0"
	//		  100						100
	//		 "7"						"7"
	//		 "2, 3"						"5"
	//		 "0"						"0"
	//		"0.25, 7.7"					"7.95"
	//		" ,.54 , 17"				"17.54"
	//		"1,0.54 , 17"				"18.54"
	//		"-0.2, 102, .2"				"102"
	
	
	@Test
	void testAddEmpty() {
		
		String number = "";
		
		String expected = "0.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testAdd0() {
		
		String number = "0";
		
		String expected = "0.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testAdd7() {
		
		String number = "7";
		
		String expected = "7.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testAdd100() {
		
		String number = "100";
		
		String expected = "100.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	

	@Test
	void testAdd2_3() {
		
		String number = "2,3";
		
		String expected = "5.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
@Test
	void testAddBigNums() {
		
		String number = "100, 123900, 176100";
		
		String expected = "300100.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	
@Test
void testAdd3Nums() {
	
	String number = "2,3,55";
	
	String expected = "60.0";
	String actual = StringCalculator.add(number);
	
	assertEquals(expected, actual);
}


@Test
	void testAddExtraSpaces() {
		
		String number = "2, 3";
		
		String expected = "5.0";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddDecimals() {
		
		String number = "0.25, 7.7";
		
		String expected = "7.95";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}

	@Test
	void testAddDecimalswBlank() {
		
		String number = " ,.54 , 17";
		
		String expected = "17.54";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd3Decimals() {
		
		String number = "1,0.54 , 17";
		
		String expected = "18.54";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddNegatives3() {
		
		String number = "-0.2, 102, .2";
		
		String expected = "Negative not allowed: [-0.2]";
		String actual = StringCalculator.add(number);
		
		assertEquals(expected, actual);
	}
	
}
