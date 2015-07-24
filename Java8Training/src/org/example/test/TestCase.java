package org.example.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCase {

	public TestClass test;

	@Before
	public void setUp() throws Exception {
		test = new TestClass();
	}

	@Test
	public void testIntMethod1() {
		Assert.assertEquals(0, test.testIntMethod());
	}

	@Test
	public void testIntMethod2() {
		Assert.assertNotEquals(1, test.testIntMethod());
	}

	@Test
	public void testStringMethod1() {
		Assert.assertNull(test.testStringMethod());
	}

	@Test
	public void testStringMethod2() {
		Assert.assertNotNull(test.testStringMethod());
	}

}
