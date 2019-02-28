package br.com.lucasbueno.swtesting1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VarNameEvalTest {

	private VarNameEval evaluatedVariable;
	private boolean actual;

	// execute before each test
	@Before
	public void setUp() {
		evaluatedVariable = new VarNameEval();
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
	
	@Test(timeout = 1000, expected = IndexOutOfBoundsException.class)
	public void falseFirstLowerCase() {
		boolean result = evaluatedVariable.isValid("A");
		Assert.assertEquals(false, result);
	}

	@Test // a test case method must return void and have no arguments	
	public void trueFirstLowercase() {
				
		actual = evaluatedVariable.isValid("aDog");		
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void falseFirstLowercase() {
		
		actual = evaluatedVariable.isValid("Adog");
		Assert.assertEquals(false, actual);
	}


	@Test
	public void falseFirstNumber() {
		
		actual = evaluatedVariable.isValid("1Dog");		
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void falseInvalidChar() {
				
		actual = evaluatedVariable.isValid("aDo g");		
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void falseEmptyString() {
				
		actual = evaluatedVariable.isValid(" ");		
		Assert.assertEquals(false, actual);
	}
	
}
