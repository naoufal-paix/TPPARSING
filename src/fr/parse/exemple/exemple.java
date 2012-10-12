package fr.parse.exemple;

import java.io.File;
import java.io.FileNotFoundException;

import projet.FileParser;

public class exemple {

	
	
	public static void main(String args[]) throws FileNotFoundException
	{
		String fichier = "/home/back/Desktop/monfichier.txt";
		File file = new File(fichier);
		CountHandler handler = new CountHandler();
		FileParser f = new FileParser();
		f.parse(file,handler);
	}
}
