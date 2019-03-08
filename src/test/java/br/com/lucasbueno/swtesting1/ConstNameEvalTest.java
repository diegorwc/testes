package br.com.lucasbueno.swtesting1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConstNameEvalTest {

	private ConstNameEval evaluatedVariable;	
	private String param;
	private boolean expected;	
	
	@BeforeClass
	public static void setUpBeforeClass() {      				
		try {
			WriteLog.writeLog("Test start");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	@Before
	public void setUp() throws IOException {
		evaluatedVariable = new ConstNameEval();		
		WriteLog.writeLog("Case start: ");
	}	
	
	@After
	public void after() throws IOException {		
		WriteLog.writeLog("Case end: ");
	}
	
	@AfterClass
	public static void afterClass() throws IOException {		
		WriteLog.writeLog("Test end: ");
	}
	
	@Parameters(name = "{index}: {0}={1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"aaa", false},
			{"Baa", false},
			{"MAX_STRING_SIZE", true}
		});							
	}

	public ConstNameEvalTest(String param, boolean result) {
		this.param = param;
		this.expected = result;		
	}
		
	@Test
	public void falseInvalidChar() {
						
		Assert.assertEquals(expected, evaluatedVariable.isValid(param));
	}
	
	@Test
	public void falseEmptyString() {
				
		Assert.assertEquals(expected, evaluatedVariable.isValid(param));
	}
	
	@Test
	public void falseAnyLowerCase() {
				
		Assert.assertEquals(expected, evaluatedVariable.isValid(param));
	}
	
	@Test
	public void trueAllowUnderscore() {
				
		Assert.assertEquals(expected, evaluatedVariable.isValid(param));
	}
}
