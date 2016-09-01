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
	File fichier=new File("Ressources/ID.json");
	FileReader reader;
	BufferedReader buffr;
	
	
	@Test
	public void testJoueurConnu() throws IOException{
		reader= new FileReader(fichier);
		test=new Joueur("Sabrina","12345");
		buffr=new BufferedReader(reader);
		String line=buffr.readLine();
		buffr.close();

	}
	
	//@Test
	
	
}
