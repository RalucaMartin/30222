package underworld.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader { 
	
	public static void printFileContents( String pathToFile ) {
		try {
			List<String> lines = Files.readAllLines( Paths.get( pathToFile ) );
			for( String line : lines ) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
