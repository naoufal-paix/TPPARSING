/*!
 *  \author Noufal FARAH & Fatiam Zahra AGNI 
 *  \version 1.0.0
 *  \since 11/10/2012 
 *  \package projet
 *  \brief ce package contient les classes ContentHandler.java et FileParser.java  
 * 
 */
package projet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



/*!
 * \class la classe FileParser contenant la methode parse 
 * 
 */
public class FileParser {
	 
	 /*!
	  * \brief cette méthode permet de lire le contenu d'un fichier et d'afficher le nombre de lignes qu'il contient 
	  *  
	  *  La classe FileParser correspond au lecteur, elle comporte une méthode # parse() qui prend en paramètre le fichier à lire et un handler permettant
	  *  d'éxecuter des actions lors de la lecture de ce fichier (callbacks) 
	  *  \param file le fichier a lire 
	  *  \param handler pour exécuter les actions lors de la lecture
	  *  \throws FileNotFoundException l'exception de fichier non trouvé 
	  */
	public void parse(File f,ContentHandler handler) throws FileNotFoundException
	{
		int templigne=0;
		int tempcomment=0;
		Scanner scanner = new Scanner(new FileReader(f));
	    try {
	      
	      while (  scanner.hasNextLine() ){
	    	  String ff = scanner.nextLine();
	    	  if(ff.startsWith("#"))
	    		  tempcomment = handler.defaultLine(ff);
	    	  else  
	    		  templigne = handler.commentligne(ff);
	      }
	    }
	    finally {
	      scanner.close();
	      System.out.println("le fichier comporte "+templigne+" lignes dont "+tempcomment+" sont des commentaires.");
	    
	  }
	}

}
