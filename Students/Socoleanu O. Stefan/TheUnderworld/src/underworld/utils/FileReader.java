package underworld.utils;
import java.io.*;
import java.util.*;

public class FileReader {
	
	public static void printFileContents (String pathToFile) {
		try {
			File f = new File("rules.txt");
			Scanner x = new Scanner(f);
			while(x.hasNext()) {
				System.out.println(x.nextLine());
			}
			x.close();
		}
		catch(Exception e) {
			System.out.println("Could not find file");
		}
		
	}
}
