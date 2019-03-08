package br.com.lucasbueno.swtesting1;

public class VarNameEval {
	public boolean isValid(String varName) {
						

		if(varName.trim().isEmpty()) {			
			return false;
		}		
					
		
		if(!Character.isLowerCase(varName.charAt(0))) {			
//			for(int i = 0; i < 1000000; i++) {
//				System.out.println("timeout test");
//			}
			return false;
		}
			
		
		if(!varName.matches("[a-zA-Z0-9]+"))
			return false;			
										
		
		return true;
	}
}
