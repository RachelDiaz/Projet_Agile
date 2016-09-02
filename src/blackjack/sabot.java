package blackjack;

import java.util.ArrayList;

public class sabot extends JeuxCartes {
	
	JeuxCartes Deck;

	public sabot() {
		Deck = new JeuxCartes();
		JeuxCartes j1 = new JeuxCartes();
		j1.JeuxCartesClassique();
		for(int j=0; j<4; j++) {
			j1.melanger();
			for(int i=0; i<j1.length();i++){
				 Deck.add(new Carte (j1.getCard(i).couleur,j1.getCard(i).valeur ));
			}
			System.out.println(Deck.length());
			for (int i = 0; i<Deck.length(); i++) {
				Deck.getCard(i).afficheCarte();
			}
		}
		
		
	}
	
	public String toString () {
		return Deck.toString();
	}

}
