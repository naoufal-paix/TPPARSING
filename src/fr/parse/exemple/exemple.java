/*!
 *  \author Noufal FARAH & Fatiam Zahra AGNI 
 *  \version 1.0.0
 *  \since 11/10/2012 
 *  \package fr.parse.exemple
 *  \brief ce package contient les classes CountHandler.java et exemple.java  
 * 
 */
package fr.parse.exemple;

import java.io.File;
import java.io.FileNotFoundException;

import projet.FileParser;

public class exemple {

	
	/*!
	 *  \class main 
	 *  \brief classe de test du projet 
	 *  la classe exemple est une classe de test qui implémente un handler utile pour tester le bon fonctionnement du FileParser 
	 *  
	 *  \throws FileNotFoundException  Cette exception est soulevée si il n'ya pas de fichier a lire ou le fichier n'existe pas 
	 *  
	 */	
	public static void main(String args[]) throws FileNotFoundException
	{
		String fichier = "/home/filieres/mas2info/farahnou/fichier.txt";
		File file = new File(fichier);
		CountHandler handler = new CountHandler();
		FileParser f = new FileParser();
		f.parse(file,handler);
	}
}
