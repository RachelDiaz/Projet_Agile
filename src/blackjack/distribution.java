package blackjack;

import java.util.ArrayList;

public class distribution {
	
	ArrayList <Carte> tapis_joueur= new ArrayList <> () ;
	ArrayList <Carte> tapis_banque= new ArrayList <> () ;
	sabot jeu = new sabot();
	
	public distribution()  {

	}
	
	public void distribuer (int mise) {
		tapis_joueur.set(0, jeu.donner());
		tapis_banque.set(0, jeu.donner()); 
		tapis_joueur.set(1, jeu.donner());
		tapis_banque.set(1, jeu.donner());
		
		System.out.println("CARTE BANQUE :");
		tapis_banque.get(0).afficheCarteBanque();
		tapis_banque.get(1).afficheCarteBanque();
		
		System.out.println("\n" + "CARTE JOUEUR :");
		tapis_joueur.get(0).afficheCarte();
		tapis_joueur.get(1).afficheCarte();
		System.out.println("Votre mise est de :" + mise + "!" + "\n");
	}
	
	public void ajout_banque(int i){
		tapis_banque.set(i, jeu.donner());
		tapis_banque.get(i).afficheCarte();
	}
	
	public void ajout_joueur(int i){
		tapis_joueur.set(i, jeu.donner());
		afficher(tapis_joueur,true);
		tapis_joueur.get(i).afficheCarte();
	}
	
	public void afficher(ArrayList <Carte> list,boolean visible) {
		if(visible){
			for(int i=0; i<list.size();i++){
				list.get(i).afficheCarte();
			}
		}
	}
}
