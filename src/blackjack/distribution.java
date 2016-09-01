package blackjack;

import java.util.ArrayList;

public class distribution {
	
	ArrayList <Carte> tapis_joueur= new ArrayList <> () ;
	ArrayList <Carte> tapis_banque= new ArrayList <> () ;
	
	public distribution()  {
		sabot jeu = new sabot();
		tapis_joueur.set(0, jeu.donner());
		tapis_banque.set(1, jeu.donner());
		tapis_joueur.set(2, jeu.donner());
		tapis_banque.set(3, jeu.donner());
	}
}
