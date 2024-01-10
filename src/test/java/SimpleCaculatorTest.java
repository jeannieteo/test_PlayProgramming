import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test_PlayProgramming.SimpleCalculator;

class SimpleCaculatorTest {

	@Test
	void test_addPostive() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(6, calculator.add(2, 4));
	}
	
	@Test
	void test_addMixed() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(-12, calculator.add(-20, 8));
	}
	
}
