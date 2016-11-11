package underworld.utils;

import java.util.List;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
   
	public static void printFileContents(String pathToFile){
		Path path = Paths.get(pathToFile);
		Charset charset = Charset.forName("ISO-8859-1");
	    try {
	      List<String> lines = Files.readAllLines(path, charset);

	      for (String line : lines) {
	        System.out.println(line);
	      }
	    } catch (IOException e) {
	      System.out.println(e);
	    }

	  }
		
	}

