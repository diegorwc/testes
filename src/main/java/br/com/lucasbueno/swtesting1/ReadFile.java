package br.com.lucasbueno.swtesting1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class ReadFile {
	
	private String readLine;
	private BufferedReader reader;
	
	public ReadFile(String filePath) throws IOException {
		//read the bytes of the file
		InputStream readFile = new FileInputStream(filePath);
				
		// decode to unicode
		InputStreamReader unicodeDecoder = new InputStreamReader(readFile, "UTF-8");
			
		//transform into strings
		reader = new BufferedReader(unicodeDecoder);
			
		//read the first line of the file
//		readLine = reader.readLine();
			
//		ArrayList<String> variables = new ArrayList<String>();
				
//		while(readLine != null) {
////		System.out.println(readLine);
//			readLine = reader.readLine();
//			variables.add(readLine);					
//		}
//			
//		for(String variableWord : variables) {
//			
//			if(variableWord.equals("null")) {
//				break;
//			}
//			
//			System.out.println(variableWord);
//		}
								
				
//code based on FJ-11 caelum's course, Chapter 16.3
	}
	
	public ArrayList<String> getVariablesList() throws IOException {
		
		ArrayList<String> variables = new ArrayList<String>();
		
		while(readLine != null) {
//			System.out.println(readLine);
			readLine = reader.readLine();
			variables.add(readLine);					
		}
		
		for(String variableWord : variables) {
			if(variableWord.equals("null")) {
				break;
			}
			System.out.println(variableWord);
		}

		closeFile();		
		return variables;
		
	}
	
	private void closeFile() throws IOException {
		
		reader.close();
	}
}
