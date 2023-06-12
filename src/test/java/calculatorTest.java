import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import CalculatorProject.Calculator;

public class calculatorTest {
	Calculator calc;
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void add2Numbers() {
		assertEquals(20, calc.add(10, 10));
		
	}
	
	@Test
	public void add3Numbers() {
		assertEquals(20, calc.add(5, 5, 10));
		
	}

	@Test
	public void subtract2Numbers() {
		assertEquals(0, calc.subtract(10, 10));
		
	}

	@Test
	public void subtract3Numbers() {
		assertEquals(0, calc.subtract(20, 10, 10));
		
	}
	
	@Test
	public void aNumbers() {
		assertEquals(20, calc.add(10, 10));
		
	}
	
	@Test
	public void bNumbers() {
		assertEquals(20, calc.add(10, 10));
		
	}
}
