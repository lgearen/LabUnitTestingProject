package edu.augustana.csc285.labs;

import static org.junit.Assert.*;
import static edu.augustana.csc285.labs.NumberUtils.*;

import org.junit.Test;

public class NumberUtilsTest {

	@Test
	public void testBiggestFirst() {		
		assertEquals(30, maxOfThree(30, 20, 10));
		assertEquals(30, maxOfThree(30, 10, 20));
	}

	@Test
	public void testBiggestMiddle() {		
		assertEquals(30, maxOfThree(20, 30, 10));
		assertEquals(30, maxOfThree(10, 30, 20));
	}
	@Test
	public void testBiggestLast() {		
		assertEquals(30, maxOfThree(10, 20, 30));
		assertEquals(30, maxOfThree(20, 10, 30));
	}

	@Test
	public void testNegative() {		
		assertEquals(-10, maxOfThree(-20, -30, -10));
	}


}
