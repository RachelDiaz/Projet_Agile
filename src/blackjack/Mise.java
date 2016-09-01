package blackjack;

import joueur.Joueur;

public class Mise {
	Joueur j1 = new Joueur();
	
	// Somme en banque
	int banque = j1.getMoney();
	int pot;
	
	public Mise(int mise) {
		pot+= mise;
		j1.Perte(mise);
	}
}
