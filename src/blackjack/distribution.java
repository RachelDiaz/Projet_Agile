package blackjack;

import java.util.ArrayList;

public class distribution {
	
	private ArrayList <Carte> tapis_joueur= new ArrayList <> () ;
	private ArrayList <Carte> tapis_banque= new ArrayList <> () ;
	private sabot jeu;
	
	public distribution()  {
		//tapis_banque = new JeuxCartes ();
		jeu = new sabot();
		
	}
	
	public void distribuer (int mise) {
		Carte c = new Carte (0,0);
		System.out.println("Debut Distribution :");
		System.out.println("Distribution carte 1 :");
		tapis_joueur.add (jeu.donner());
		System.out.println("Distribution carte 2 :");
		tapis_banque.add (jeu.donner()); 
		tapis_joueur.add (jeu.donner());
		tapis_banque.add (jeu.donner());
		
		
		System.out.println("CARTE BANQUE :");
		System.out.println(tapis_banque.size());
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
