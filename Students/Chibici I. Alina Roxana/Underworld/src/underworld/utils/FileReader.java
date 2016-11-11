package underworld.utils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//my copy paste method that I have no idea how it works 
public class FileReader {
	public static void printFileContents(String pathToFile) {
		List<String> lines = null;
			try {
				lines = Files.readAllLines(Paths.get(pathToFile), Charset.forName("UTF-8"));
				for(String line:lines){
					System.out.println(line);
				}
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
	}
}