package br.com.lucasbueno.swtesting1;

/**
 * Given a String representing a var name, evaluate if it is valid. A valid var
 * name contains only alphanumeric chars and the first char must be a lower case
 * letter.
 *
 */
public class App {
	public static void main(String[] args) {
//		VarNameEval eval = new VarNameEval();
//		System.out.println(eval.isValid("BIRTHDATE"));
		
		ConstNameEval constEval = new ConstNameEval();
		System.out.println(constEval.isValid("BIRTH DATE"));
		
		
	}
}
