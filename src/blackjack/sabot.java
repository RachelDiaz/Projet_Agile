package blackjack;

import java.util.ArrayList;

public class sabot extends JeuxCartes {
	
	JeuxCartes Deck;

	public sabot() {
		JeuxCartes j1 = new JeuxCartes();
		for(int j=0; j<4; j++) {
			j1.JeuxCartesClassique();
			j1.melanger();
			for(int i=0; i<j1.length();i++){
				j1.donner();
			}
		}
		
	}

}
