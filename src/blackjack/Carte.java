package blackjack;

import java.util.Scanner;

public class Carte {
	static public final String [] VALEURCARTE = {"", "AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
	public static final String [] COULEURCARTE = {"", "COEUR", "CARREAU", "TREFLE", "PIQUE"};
	private int couleur;
	private int valeur ;
	
	Carte (int c, int v) {
		couleur = c;
		valeur = v;
	}
	
	public String toString () {
		return "" + VALEURCARTE[this.valeur] + " " + COULEURCARTE [this.couleur];
	}
	
	
	public String afficheCarteAscii(int c, int v) {
		return "*********" + "\n" + 
			   "*.......*" + "\n" +
			   COULEURCARTE[c] + "\n" +
			   "*.......*" + "\n" +
			   VALEURCARTE[v] + "\n" +
			   "*.......*" + "\n" +
			   "*********";
	}
	
	public void afficheCarte() {
		System.out.println( "** "+ COULEURCARTE[this.couleur] +" ** "+ VALEURCARTE[this.valeur] + " **");
	}
	
	public void afficheCarteBanque() {
		System.out.println( "** -------- ** ----- **" + "\n") ;
	}
	public boolean equals (Object autre) {
		if (autre instanceof Carte) return equals(autre);
		return false;
	}
	
	public boolean equals (Carte autre) {	
		if (this.couleur == autre.couleur && this.valeur == autre.valeur) return true;
		return false;
	}
	
	public void copie (Carte autre) {
		this.couleur = autre.couleur;
		this.valeur = autre.valeur;
	}
	
	
	public int getValeur() {
		if(this.valeur >= 2 && this.valeur <=10) {
			return this.valeur;
		}
		else if(this.valeur >10 && this.valeur <=13) {
			return 10;
		}
		else if(this.valeur == 1){
			return this.getValeurAs();
		} else {
			return 0;
		}
	}
	
	public int getValeurAs() {
		System.out.println("Vous avez un AS, il peux valoir 1 ou 11," + "\n" +
							"Que Choissisez-vous ?");
		Scanner scan = new Scanner(System.in);
		int valeur_as = scan.nextInt();
		while(valeur_as != 1 || valeur_as != 11) {
			if(valeur_as == 1) {
				return 1;
			}
			else if(valeur_as == 11) {
				return 11;
			}
			else {
				System.out.println("Vous avez saisis une valeur autre que 1 ou 11, recommencez !");
				valeur_as = scan.nextInt();
			}
		}
		return 0;
	
	}
	
}
