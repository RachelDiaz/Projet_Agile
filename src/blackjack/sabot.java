package blackjack;

import java.util.ArrayList;

public class sabot extends JeuxCartes {
	
	private JeuxCartes Deck;

	public sabot() {
		Deck = new JeuxCartes();
		JeuxCartes j1 = new JeuxCartes();
		j1.JeuxCartesClassique();
		
		for(int j=0; j<4; j++) {
			j1.melanger();
			for(int i=0; i<j1.length();i++){
				 Deck.add(j1.getCard(i));
				 System.out.println(j1.getCard(i));
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
