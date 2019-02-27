package br.com.lucasbueno.swtesting1;

public class VarNameEval {
	public boolean isValid(String varName) {
				
		if(varName.isEmpty())			
			return false;		
		
		if(!Character.isLowerCase(varName.charAt(0)))
			return false;
		
		if(!varName.matches("[a-zA-Z0-9]+"))
			return false;			
										
		return true;
	}
}
