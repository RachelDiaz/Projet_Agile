package blackjack;

import java.util.ArrayList;

public class distribution {
	
	ArrayList <Carte> tapis_joueur= new ArrayList <> () ;
	ArrayList <Carte> tapis_banque= new ArrayList <> () ;
	
	public distribution()  {
		sabot jeu = new sabot();
		tapis_joueur.set(0, jeu.getCarte(0));
		tapis_banque.set(1, jeu.getCarte(1));
		tapis_joueur.set(2, jeu.getCarte(2));
		tapis_banque.set(3, jeu.getCarte(3));
	}
}
