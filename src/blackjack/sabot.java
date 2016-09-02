package blackjack;

import java.util.ArrayList;

public class sabot extends JeuxCartes {


	public sabot() {
		JeuxCartes j1 = new JeuxCartes();
		j1.JeuxCartesClassique();
		
		for(int j=0; j<4; j++) {
			j1.melanger();
			for(int i=0; i<j1.length();i++){
				 myJeux.add(j1.getCard(i));
				 System.out.println(j1.getCard(i));
			}
			System.out.println(myJeux.size());
			for (int i = 0; i<myJeux.size(); i++) {
				myJeux.get(i).afficheCarte();
			}
		}
		
		
	}
	
	public String toString () {
		return myJeux.toString();
	}

}
