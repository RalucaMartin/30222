package Underworld.utils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class FileReader {
public static void printFileContents(String pathToFile){
	Path rules_path = Paths.get("C:/Users/Oana Heredea/Desktop/30222/Resources/The Underworld/rules.txt");
	Charset charset = Charset.forName("ISO-8859-1");
	try {
	      List<String> lines = Files.readAllLines(rules_path, charset);

	      for (String line : lines) {
	        System.out.println(line);
	      }
	    } catch (IOException e) {
	      System.out.println(e);
	    }

	  }
}

