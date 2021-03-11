package com.training.unittesting.sampleTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.training.unittesting.sample.Counter;

public class CounterTest {

	Counter counter1 = new Counter();

	public CounterTest() {
	} // default constructor

	// @BeforeClass
	protected void setUp() { // creates a (simple) test fixture
		counter1 = new Counter();
	}

	protected void tearDown() {
	} // no resources to release

	@Test
	public void testIncrement() {
		assertTrue(counter1.increment() == 1);
		assertTrue(counter1.increment() == 2);
	}

	@Test
	public void testDecrement() {
		assertTrue(counter1.decrement() == -1);
	}

}
