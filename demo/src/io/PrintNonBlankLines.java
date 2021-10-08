package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintNonBlankLines {
	public static void main(String[] args) throws Exception {
	 
		FileReader fr = new FileReader("c:\\classroom\\sep7\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if(line == null)  // EOF
				break;
			if (line.strip().length() > 0) // non-blank line 
			   System.out.println(line.toUpperCase());
		}
		
		fr.close(); 
	}

}
