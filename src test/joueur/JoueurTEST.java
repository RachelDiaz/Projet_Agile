package joueur;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.GsonBuilder;

public class JoueurTEST {
	private Joueur test;
	
	 @Test
	 public void testIniSansNom(){
		 test= new Joueur();
		 assertEquals(test.getName(),"Sabrina");
	 }
	 
	/* @Test
	 public void testIniAvcNom(){
		 String nom="Morsay";
		 test= new Joueur(nom);
		 assertTrue(test.getName()==nom);
	 }*/
	 
	 @Test
	 public void testNbJeton(){
		 test=new Joueur();
		 equals(test.getMoney()==200);
	 }
	 
	 @Test
	 public void testMoney0(){
		 test=new Joueur();
		 test.setMoney(0);
		 assertFalse(test.resteMoney());
	 }
	 
	 @Test
	 public void testMoneyNon0(){
		 test=new Joueur();
		 assertTrue(test.resteMoney());
	 }
	 
	 @Test
	 public void testGain50(){
		 test=new Joueur();
		 test.Gain(50);
		 assertTrue(test.getMoney()==250);
	 }
	 
	 @Test
	 public void testPerteInfMoney(){
		 test=new Joueur();
		 test.Perte(50);
		 assertFalse(test.getMoney()==0);
	 }
	 
	 @Test 
	 public void testPerteSupMoney(){
		 test=new Joueur();
		 test.Perte(250);
		 assertTrue(test.getMoney()==0);
	 }
	 
	 @Test
	 public void testjson(){
		 
		 List<Joueur> joueurs = new ArrayList<>();
		 test=new Joueur();
		 joueurs.add(test);
		 Joueur test2=new Joueur();
		 joueurs.add(test2);
		 String text=new GsonBuilder().create().toJson(joueurs);
		 System.out.println(text);
	 }
	 
	 @Test
	 public void testjson2(){
		
		 Joueur joueur =new GsonBuilder().create().fromJson("{\"name\":\"Sabrina\",\"money\":200,\"code\":\"12345\"}", Joueur.class);
		 System.out.println(joueur.getName());
	 }
}
