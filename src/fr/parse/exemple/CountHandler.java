/*!
 *  \author Noufal FARAH & Fatiam Zahra AGNI 
 *  \version 1.0.0
 *  \since 11/10/2012 
 *  \package fr.parse.exemple
 *  \brief ce package contient les classes CountHandler.java et exemple.java  
 * 
 */
package fr.parse.exemple;

/*! 
 *  \author Noufal FARAH & Fatiam Zahra AGNI 
 *  \version 1.0.0
 *  \since 11/10/2012  
 */
import projet.ContentHandler;



/*!
 *  \class CountHandler
 *  \brief cette classe permet de compter le nombre de lignes dans le fichier 
 *  
 *  defini une interface permettant l'implémentation d'un handler pour exécuter les actions lors de la lecture.Le 
 *  parser appelle la méthode #defaultLine() à chaque nouvelle ligne lue, en lui passant en paramètre le contenu de cette ligne.
 */
public class CountHandler implements ContentHandler {

	/*! attribut qui contient le nombre de lignes dans les fichier !*/
	int compteurligne=0;
	int compteurcomment=0;
	/*!
	 * \brief methode qui affiche le contenu du fichier ligne par ligne
	 * \param content chaine de caractere contenant la ligne a afficher
	 * \return retourne le nombre de lignes  
	 */
	@Override
	public int defaultLine(String content) {
		System.out.println(content);
		compteurligne++;
		return compteurligne;
	}

	@Override
	public int commentligne(String comment) {
		System.out.println(comment);
		compteurcomment++;
		return compteurcomment;
		
		
	}

}
