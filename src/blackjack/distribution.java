package blackjack;

import java.util.ArrayList;

public class distribution {
	
	ArrayList <Carte> tapis_joueur= new ArrayList <> () ;
	ArrayList <Carte> tapis_banque= new ArrayList <> () ;
	sabot jeu = new sabot();
	
	public distribution()  {
		tapis_joueur.set(0, jeu.donner());
		tapis_banque.set(0, jeu.donner());
		tapis_joueur.set(1, jeu.donner());
		tapis_banque.set(1, jeu.donner());
	}
	
	public void ajout_banque(int i){
		tapis_banque.set(i, jeu.donner());
	}
	
	public void ajout_joueur(int i){
		tapis_joueur.set(i, jeu.donner());
	}
}
