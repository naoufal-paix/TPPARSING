/*!
 *  \author Noufal FARAH & Fatiam Zahra AGNI 
 *  \version 1.0.0
 *  \since 11/10/2012 
 *  \package projet
 *  \brief ce package contient les classes ContentHandler.java et FileParser.java  
 * 
 */
package projet;

/*!
 *  \interface l'interface ContentHandler 
 * 
 */
public interface ContentHandler {
	
	/*!
	 *  \brief ligne par defaut 
	 * 
	 *  \param ligne la ligne du fichier a afficher
	 */
	public int defaultLine(String ligne);

}
