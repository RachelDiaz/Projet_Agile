package blackjack;

import java.util.ArrayList;

public class distribution {
	
	ArrayList <Carte> tapis_joueur= new ArrayList <> () ;

	public distribution()  {
		sabot jeu = new sabot();
		tapis.set(0, jeu.getCarte(0));
		tapis.set(1, jeu.getCarte(1));
	}
}
