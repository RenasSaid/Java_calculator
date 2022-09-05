package java_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void test1plus1() {
		Representation rep = new Representation(1.0, 1.0, '+');
		double calc = Calculator.calculate(rep);
		assertEquals(2.0, calc, 0.0);
	
	}
	
	@Test
	public void test1minus1() {
		Representation rep = new Representation(1.0, 1.0, '-');
		double calc = Calculator.calculate(rep);
		assertEquals(0.0, calc, 0.0);
	
	}
	
	@Test
	public void test3divie2() {
		Representation rep = new Representation(3.0, 2.0, '/');
		double calc = Calculator.calculate(rep);
		assertEquals(1.5, calc, 0.0);
	
	}	
	
	@Test
	public void test3gånger2() {
		Representation rep = new Representation(3.0, 2.0, '*');
		double calc = Calculator.calculate(rep);
		assertEquals(6.0, calc, 0.0);
	
	}
	
}
