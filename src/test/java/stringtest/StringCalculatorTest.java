package stringtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import stringtest.StringCalculator;

public class StringCalculatorTest {
	@Test
	public void testString() {
		assertEquals(1, new StringCalculator().add("1"));
	}
}
