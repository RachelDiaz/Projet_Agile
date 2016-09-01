package blackjack;

import java.util.ArrayList;

public class sabot {

	ArrayList <Carte> Deck = new ArrayList <> () ;
	
	public sabot() {
		JeuxCartes j1 = new JeuxCartes();
		for(int j=0; j<4; j++) {
			j1.melanger();
			for(int i=0; i<j1.length();i++){
				Deck.add(j1.myJeux.get(i));
			}
		}
		
	}
	
	public Carte getCarte(int indice) {
		return Deck.get(indice);
	}

}
