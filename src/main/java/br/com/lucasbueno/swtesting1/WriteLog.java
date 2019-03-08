package br.com.lucasbueno.swtesting1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WriteLog {
	
	public static void writeLog(String logMessage) throws IOException {
		
		OutputStream fileToOutput = new FileOutputStream("log.txt", true);		
		OutputStreamWriter osw = new OutputStreamWriter(fileToOutput, "UTF-8");		
		BufferedWriter bw = new BufferedWriter(osw);		
		bw.write(logMessage + LocalDateTime.now().
				format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
				+ "\n");	
		bw.close();
	}
		
}
