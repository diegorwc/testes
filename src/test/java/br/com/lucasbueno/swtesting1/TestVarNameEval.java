package br.com.lucasbueno.swtesting1;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestVarNameEval {
	
	private VarNameEval evaluatedVariable;
	private boolean actual;
	
	@Before
	public void startTest() {
		evaluatedVariable = new VarNameEval();		
	}

	@Test
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
				
		actual = evaluatedVariable.isValid(" 1");		
		Assert.assertEquals(false, actual);
	}
}
