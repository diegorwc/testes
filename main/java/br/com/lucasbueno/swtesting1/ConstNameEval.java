package br.com.lucasbueno.swtesting1;

public class ConstNameEval {
	public boolean isValid(String varName) {
						
		if(varName.trim().isEmpty()) {			
			return false;
		}
						
		if(!varName.matches("[A-Z0-9_]+")) {
			return false;
		}
						
		for(int count = 0; count < varName.length(); count++) {
			
			if(Character.isLowerCase(varName.charAt(count))) {
				System.out.println(varName.charAt(count) + ": " + Character.isLowerCase(varName.charAt(count)));
				return false;
			}
				
		}
			
		return true;
	}
}
