package underworld.units;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
	public static void printFileContents( String pathToFile){
		try {
			System.out.println(Files.readAllLines(Paths.get(pathToFile))) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
