package br.com.lucasbueno.swtesting1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VarNameEvalTest {

	private VarNameEval varNameEval;

	// execute before each test
	@Before
	public void setUp() {
		varNameEval = new VarNameEval();
	}

	// execute after each test
	@After
	public void tearDown() {

	}

	// execute before all tests
	@BeforeClass
	public static void setUpBeforeClass() {

	}

	// execute after all tests
	@AfterClass
	public static void tearDownAfterClass() {

	}

	@Test // a test case method must return void and have no arguments
	public void trueFirstLowerCase() {
		boolean result = varNameEval.isValid("a");
		Assert.assertEquals(true, result);
	}

	@Test(timeout = 1000, expected = IndexOutOfBoundsException.class)
	public void falseFirstLowerCase() {
		boolean result = varNameEval.isValid("A");
		Assert.assertEquals(false, result);
	}

	@Test
	public void falseFirstNumberCase() {
		boolean result = varNameEval.isValid("1aaa");
		Assert.assertEquals(false, result);
	}
		
}
