package blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class JeuxCartes {
	ArrayList <Carte> myJeux = new ArrayList <> ();
	
	public JeuxCartes() {
		for (int i = 1; i < Carte.VALEURCARTE.length; i++) {
			for (int j = 1; j < Carte.COULEURCARTE.length; j++) {
				myJeux.add(new Carte (j, i));
			}
		}
	}
	
	public int length () {
		return myJeux.size();
	}
	
	public Carte donner () {
		if (!myJeux.isEmpty()) return myJeux.remove(0);
		else return null;
	}
	
	public void melanger () {
		Collections.shuffle(myJeux);		
	}
	
	

}


