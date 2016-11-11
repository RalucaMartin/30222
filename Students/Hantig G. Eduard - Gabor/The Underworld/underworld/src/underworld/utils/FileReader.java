package underworld.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class FileReader {
	public static void printFileContents(String pathToFile) {
		Path path = Paths.get(pathToFile);
		
		try
		{
			List<String> lines = Files.readAllLines(path);
			for (String linie: lines) {
				System.out.println(linie);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	};
} 
