package fr.parse.exemple;

import projet.ContentHandler;

public class CountHandler implements ContentHandler {

	int compteur=0;
	@Override
	public int defaultLine(String content) {
		System.out.println(content);
		compteur++;
		return compteur;
	}

}
