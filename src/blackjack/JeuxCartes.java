package blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class JeuxCartes {
	private ArrayList <Carte> myJeux;
	
	public JeuxCartes() {
		myJeux = new ArrayList<>();
	}
	
	public void JeuxCartesClassique() {
		//System.out.println("Création du jeux de carte classique");
		for (int i = 1; i < Carte.VALEURCARTE.length; i++) {
			for (int j = 1; j < Carte.COULEURCARTE.length; j++) {
				myJeux.add(new Carte (j, i));
			}
		}
		//System.out.println("Carte 1 : " + myJeux.get(0).toString());
	}
	
	public int length () {
		return myJeux.size();
	}
	
	public Carte donner () {
			return myJeux.remove(0);
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return myJeux.isEmpty();
	}

	public void melanger () {
		Collections.shuffle(myJeux);		
	}
	
	public Carte getCard (int index) {
		//if (index < myJeux.size() && index >=0) return null;
		return myJeux.get(index);
	}
	
	public void add (Carte c){
		myJeux.add(c);
	}
	
	

}


