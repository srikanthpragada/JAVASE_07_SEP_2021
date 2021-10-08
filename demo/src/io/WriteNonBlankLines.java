package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteNonBlankLines {
	public static void main(String[] args) throws Exception {

		try (FileReader fr = new FileReader("c:\\classroom\\sep7\\test.txt");
				FileWriter fw = new FileWriter("c:\\classroom\\sep7\\test2.txt");
				BufferedReader br = new BufferedReader(fr)) {

			while (true) {
				String line = br.readLine();
				if (line == null) // EOF
					break;
				if (line.strip().length() > 0) // non-blank line
					fw.write(line.strip() + "\n");
			}
		}
	}

}
