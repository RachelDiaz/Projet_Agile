package blackjack;

import java.util.Scanner;

import joueur.Joueur;

public class BlackJack {
	private Joueur j1;
	private int mise;
	private distribution dt;
	private int total_valeur_joueur;
	private int total_valeur_banque;
	
	public BlackJack(Joueur j) {
		j1 = j;
		lancerPartie();
	}
	
	public void lancerPartie() {
		
		System.out.println("Bonjour, Bienvenue sur la table de BlackJack !" + "\n"+ "\n" +
							"Combien voulez-vous misez cette fois-ci ?");
		Scanner scan = new Scanner(System.in);
		mise = scan.nextInt();
		scan.close();
		while(mise<=j1.getMoney()){
			System.out.println("Votre Mise est supérieur à votre solde !"+"\n"+
					"Merci de bien miser en dessous de : " + j1.getMoney() + "! \n" +		   
					"Combien voulez-vous misez cette fois-ci ?");
			mise = scan.nextInt();
		}
		dt.distribuer(mise);
		scan.close();
	}
	
	public int demandenouvelcarte() {
		int nb_joueur = 2;
		System.out.println("Voulez-vous repiocher une carte ?" + "\n" +
							"Tapez 1 pour oui ou" + "\n" +
							"Tapez 2 pour non");
		Scanner scan2 = new Scanner(System.in);
		int res = scan2.nextInt();
		if(res==1){
			dt.ajout_joueur(nb_joueur);
			nb_joueur+=1;
			return 1;
		} else {
			return 2;
		}
	}
	
	// Somme en banque
	int banque = j1.getMoney();
	int pot;
	
	public void  mise(int mise) {
		pot+= mise;
		j1.Perte(mise);
	}
	
	
}
