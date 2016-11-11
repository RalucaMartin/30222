package underworld.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
	public void printFileContents (String pathToFile) {
		 Path path = Paths.get(Constants.PATH_TO_RULES_FILE);
		 
		 try {
			 List<String> lines = Files.readAllLines(path);
			 for (String line : lines) {
				 System.out.println(line);
			 }
		 }
		 
		 catch (IOException e) {
			 System.out.println(e);
		 }
	}

}
