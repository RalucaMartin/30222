package underworld.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
	/**
	 * This method must print to console the contents of a file located at the
	 * path specified by the pathToFile parameter. Search for an example of
	 * Files.readAllLines online. Use try-catch blocks to handle file reading.
	 * 
	 * @param pathToFile
	 */
	public static void printFileContents(String pathToFile) {
		// I don't understand how this works
		Path path = Paths.get(Constants.PATH_TO_RULES_FILE);

		try {
			List<String> lines = Files.readAllLines(path);
			// If you only need to reference the value of each of the elements,
			// you can use the somewhat simpler Java 5 for loop, which keeps
			// track of the index and assigns successive values to a variable (line in our case)
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
