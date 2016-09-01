package blackjack;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import blackjack.JeuxCartes;

public class TestJeuxCartes {



	@Test
	public void testLength() {
		JeuxCartes unJeux = new JeuxCartes();
		unJeux.JeuxCartesClassique ();
		assertEquals (unJeux.length(), 52);	
	}
	
	@Test
	public void testMelange () {
		JeuxCartes unJeuxOri = new JeuxCartes ();
		JeuxCartes unJeux = new JeuxCartes();
		int nb = 0;
		unJeux.melanger();
		
		for (int i = 0; i<unJeux.length(); i++)
			if (! unJeux.donner().equals(unJeuxOri.donner())) nb++;
		
		assertTrue (nb < 6);
	}

}
