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
		dt = new distribution ();
		lancerPartie();
	}
	
	public void lancerPartie() {
		
		System.out.println("Bonjour, Bienvenue sur la table de BlackJack !" + "\n"+ "\n" +
							"Combien voulez-vous misez cette fois-ci ?");
		Scanner scan = new Scanner(System.in);
		mise = scan.nextInt();
		while(mise>j1.getMoney()){
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
			scan2.close();
			return 1;
		} else {
			scan2.close();
			return 2;
		}
	}
	

	
	public void  mise(int mise) {
		// Somme en banque
		int banque = j1.getMoney();
		int pot =0; 
		pot += mise;
		j1.Perte(mise);
	}
	
	//-------------------------------------------------------------------
	public static void main(String[] args){
		Joueur myJoueur = new Joueur ();
		BlackJack bj;
		
		bj = new BlackJack(myJoueur);
		do {
			
		}while (bj.demandenouvelcarte() == 1);
	}
	
	
}
