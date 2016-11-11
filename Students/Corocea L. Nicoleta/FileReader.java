package underworld.utils;

import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.List;

public class FileReader {
	public static void printFileContents(String pathToFile) {
		Path wiki_path = Paths.get(Constants.PATH_TO_THE_RULES);

		try {
			List<String> lines = Files.readAllLines(wiki_path);

			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
