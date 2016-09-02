package joueur;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.gson.GsonBuilder;

public class SaveTest {
	Joueur test;
	Save savance;
	
	
	@Test
	public void testLogAcJoueurConnu() throws IOException{
		savance=new Save();
		test=new Joueur("Sabrina","LASORCIERE");
		assertTrue(savance.login(test));
		

	}
	
	@Test
	public void testlogAcJoueurNonConnu() throws IOException{
		savance=new Save();
		test=new Joueur("Loic","12345");
		assertFalse(savance.login(test));
	}
	
	@Test
	public void testRegAcJoueurNonConnu() throws IOException{
		savance=new Save();
		test=new Joueur("Jean","124578");
		assertTrue(savance.register(test));
		
		
	}
	
	@Test
	public void testRegAcJoueurConnu() throws IOException{
		savance=new Save();
		test=new Joueur("Dédé","LEDE");
		assertTrue(savance.login(test));
		assertFalse(savance.register(test));
		
	}
	
	
	
	
}
