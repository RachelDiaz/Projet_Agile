package blackjack;

public class Carte {
	static public final String [] VALEURCARTE = {"", "AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
	public static final String [] COULEURCARTE = {"", "COEUR", "CARREAU", "TREFLE", "PIQUE"};
	int couleur;
	int valeur ;
	
	Carte (int c, int v) {
		couleur = c;
		valeur = v;
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
	
	public String afficheCarte(int c, int v) {
		return "** "+ COULEURCARTE[c] +" ** "+ VALEURCARTE[v] + " **";
	}
	
	public String afficheCarteBanque() {
		return "** -------- ** ----- **";
	}
	public boolean equals (Object autre) {
		if (autre instanceof Carte) return equals(autre);
		return false;
	}
	
	public boolean equals (Carte autre) {	
		if (this.couleur == autre.couleur && this.valeur == autre.valeur) return true;
		return false;
	}
	
}
