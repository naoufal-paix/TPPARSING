package projet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileParser {
	
	
	public void parse(File f,ContentHandler handler) throws FileNotFoundException
	{
		int temp=0;
		Scanner scanner = new Scanner(new FileReader(f));
	    try {
	      
	      while (  scanner.hasNextLine() ){
	    	  temp = handler.defaultLine(scanner.nextLine());
	      }
	    }
	    finally {
	      scanner.close();
	      System.out.println("le fichier comporte "+temp+" lignes.");
	    
	  }
	}

}
