package underworld.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

	public void printFileContents (String pathToFile){
	    Path wiki_path = Paths.get(Constants.PATH_TO_RULES_FILE,"rules.txt");

	    Charset charset = Charset.forName("ISO-8859-1");
	    try {
	      List<String> lines = Files.readAllLines(wiki_path, charset);

	      for (String line : lines) {
	        System.out.println(line);
	      }
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	    
	}
	}





