package machine_sous;

import java.util.Random;
import java.util.Scanner;

import joueur.Joueur;

public class Machine {
	private Joueur joueur;
	private int mise;
	private Character Character1;
	private Character Character2;
	private Character Character3;
	private Character[] liste= new Character[] {'7','*','$','?','§'};
	private int gain;
	private int jackpot = 1000;
	
	public Machine(){
		this.mise=1;
		this.setCharacter1(liste[0]);
		this.setCharacter2(liste[0]);
		this.setCharacter3(liste[0]);
		this.gain=0;
		this.joueur=new Joueur();
	}
	
	public Machine(Joueur joueur){
		this.mise=1;
		this.setCharacter1(liste[0]);
		this.setCharacter2(liste[0]);
		this.setCharacter3(liste[0]);
		this.gain=0;
		this.joueur=joueur;
	}
	
	public void Miser(int mise){
			if (mise < 0) this.mise = 1;
			else if (mise > 10) this.mise=10;
			else this.mise=mise;
		
	}
	
	public int getMise(){
		return this.mise;
	}
	
	public int getGain(){
		return this.gain;
	}

	public Character getCharacter2() {
		return Character2;
	}

	public void setCharacter2(Character Character2) {
		this.Character2 = Character2;
	}

	public Character getCharacter1() {
		return Character1;
	}

	public void setCharacter1(Character Character1) {
		this.Character1 = Character1;
	}

	public Character getCharacter3() {
		return Character3;
	}

	public void setCharacter3(Character Character3) {
		this.Character3 = Character3;
	}
	
	public Character liste(int indice){
		if (indice < 5 && indice >= 0) return this.liste[indice];
		else return '0';
	}
	
	public boolean chercherListe(Character c){
		boolean trouver=false;
		for(Character d:this.liste){
			if (c.equals(d)) trouver=true;
		}
		return trouver;
	}
	
	public int Alea(){
		Random alea = new Random();
		int nombre = alea.nextInt(100);
		if (nombre < 60)  return 4;
		else if (nombre < 90)  return 3;
		else if (nombre < 95)  return 2;
		else if (nombre < 99)  return 1;
		else return 0;
	}
	
	public void tirage(){
		int indice;
		for(int i=0; i<3;i++){
			indice=this.Alea();
			if (i==0) this.Character1=this.liste[indice];
			else if(i==1) this.Character2=this.liste[indice];
			else this.Character3=this.liste[indice];
		}
	}
	
	public boolean combinaisonGagnante(){
		if (this.getCharacter1().equals(this.getCharacter2()) && this.getCharacter1().equals(this.getCharacter3())) {
			return true;
		}else {
			return false;
		}
	}
	
	public void gagner(){
		if (this.combinaisonGagnante()) {
			if (this.getCharacter1().equals(this.liste(4))){
				this.gain+=mise*1;
				System.out.println("Vous avez regagné votre mise.");
			}else if (this.getCharacter1().equals(this.liste(3))){
				this.gain+=mise*2;
				System.out.println("Vous avez doublé votre mise.");
			}else if (this.getCharacter1().equals(this.liste(2))){ 
				this.gain+=mise*5;
				System.out.println("Vous avez multiplié votre mise par 5.");
			}else if (this.getCharacter1().equals(this.liste(1))){
				this.gain+=mise*10;
				System.out.println("Vous avez multiplié votre mise par 10.");
			}else{
				this.gain+=mise+this.jackpot; 
				this.jackpot=1000;
				System.out.println("Vous avez gagné le Jackpot de "+this.jackpot+".");
			}
		}else {
			this.jackpot+=this.mise;
			System.out.println("Vous avez perdu votre mise. Celle-ci a été ajouté au Jackpot qui est de "+this.jackpot+".");
		}
	}
	
	public void Affichage(Machine machine) {
		
		System.out.println("");
		System.out.println("        .-------.");
		System.out.println("     oO{-JACKPOT-}Oo");
		System.out.println("   .=================. __");
		System.out.println("   |  ["+machine.liste(new Random().nextInt(5))+"]  ["+machine.liste(new Random().nextInt(5))+"]  ["+machine.liste(new Random().nextInt(5))+"]  |(  )");
		System.out.println("   |  | |  | |  | |  | ||");
		System.out.println("   |  ["+machine.getCharacter1()+"]  ["+machine.getCharacter2()+"]  ["+machine.getCharacter3()+"]  | ||");
		System.out.println("   |  | |  | |  | |  | ||");
		System.out.println("   |  ["+machine.liste(new Random().nextInt(5))+"]  ["+machine.liste(new Random().nextInt(5))+"]  ["+machine.liste(new Random().nextInt(5))+"]  | ||");
		System.out.println("   |                 |_||");
		System.out.println("   |   §§§  x1       |--'");
		System.out.println("   |   ???  x2       |");
		System.out.println("   |   $$$  x5       |");
		System.out.println("   |   ***  x10      |");
		System.out.println("   |   777  Jackpot  |");
		System.out.println("   |                 |");
		System.out.println("   |        __  ===  |");
		System.out.println("   |_______/__\\______|");
		System.out.println("   /#################\\");
		System.out.println("  /###################\\");
		System.out.println(" |#####################|");
	}
	
	public void clearScreen(){
		for(int clear = 0; clear < 20; clear++)
		  {
		     System.out.println("");
		  }
	}
	
	public boolean peutMiser(int mise){
		if (mise <= this.joueur.getMoney()) return true;
		else return false;
	}
	
	public Joueur getJoueur(){
		return this.joueur;
	}
		
	
}