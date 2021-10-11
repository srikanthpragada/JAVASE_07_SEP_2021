package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortWords2 {

	public static void main(String[] args) throws Exception {
		Path path = Path.of("c:\\classroom\\old_man.txt");
		String contents = Files.readString(path);
		String words[] = contents.split("\\W"); // Use non-word to split

		var sortedWords = new TreeSet<String>();

		for (String w : words)
			if (w.trim().length() > 0)
				sortedWords.add(w);

		for (String w : sortedWords) {
			System.out.println(w);

		}
	}

}
