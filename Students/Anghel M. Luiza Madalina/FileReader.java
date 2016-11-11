package underworld.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileReader {
	public static void printFileContents(String[] args)
	{
	  Path wiki_path = Paths.get("C:/Users/User/Desktop/30222/Students/Anghel M. Luiza Madalina", "rules.txt");
      Charset charset = Charset.forName("UTF-8");
    try {
      List<String> lines = Files.readAllLines(wiki_path, charset);

      for (String line : lines) {
        System.out.println(line);
      }
    } 
    catch (IOException e) {
      System.out.println(e);
    }
  }
}