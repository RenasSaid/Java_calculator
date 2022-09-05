package java_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepresentationParserTest {

	@Test
	public void testParser() {
		Representation actual = RepresentationParser.parse("1", "+", "1");
		Representation expected = new Representation(1.0, 1.0, '+');
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testNegativeNums() {
		Representation actual = RepresentationParser.parse("-1", "+", "-2");
		Representation expected = new Representation(-1.0, -2.0, '+');
		assertEquals(expected, actual);
		
	}
	
	@Test(expected = RepresentationParserException.class)
	public void testException() {
		Representation actual = RepresentationParser.parse("fel", "här", "eller");

		
	}
	
}
