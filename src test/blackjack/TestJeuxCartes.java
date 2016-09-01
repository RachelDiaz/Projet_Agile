package blackjack;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import blackjack.JeuxCartes;

public class TestJeuxCartes {



	@Test
	public void testLength() {
		JeuxCartes unJeux = new JeuxCartes();
		assertEquals (unJeux.length(), 52);	
	}

}
