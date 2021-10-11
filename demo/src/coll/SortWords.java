package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeSet;

public class SortWords {

	public static void main(String[] args) throws Exception  {
		var fr = new FileReader("c:\\classroom\\old_man.txt");
		var br = new BufferedReader(fr);
		var sortedWords = new TreeSet<String>();
		
		while(true) {
			String line = br.readLine();
			if(line == null)  // EOF
				break;
			
			String words [] = line.split(" ");
			for(String w : words)
				sortedWords.add(w);
		}
		
		fr.close();
		
		for(String w : sortedWords)
			System.out.println(w);

	}

}
