package blackjack;

import java.util.ArrayList;

public class sabot extends JeuxCartes {
	
	JeuxCartes Deck;

	public sabot() {
		JeuxCartes j1 = new JeuxCartes();
		j1.JeuxCartesClassique();
		for(int j=0; j<4; j++) {
			j1.melanger();
			for(int i=0; i<j1.length();i++){
				 j1.donner();
			}
		}
		
	}
	
	public String toString () {
		return Deck.toString();
	}

}
