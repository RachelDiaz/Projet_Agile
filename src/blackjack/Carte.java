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
}
