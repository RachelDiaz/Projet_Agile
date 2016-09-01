package Roulette;
import Main.*;

import java.util.Scanner;

public class ChoixMise {
	private Scanner scan;
	//Variable to check
	static boolean pair = false;
	static boolean impair = false;
	static boolean noir = false;
	static boolean rouge = false;
	static boolean zero = false;
	static boolean stmoitie = false;
	static boolean ndmoitie = false;
	static boolean stdouzaine = false;
	static boolean nddouzaine = false;
	static boolean rddouzaine = false;
	static boolean stcolonne = false;
	static boolean ndcolonne = false;
	static boolean rdcolonne = false;
	
	public ChoixMise() {
		saisiMise();
		saisiPlace();
		new Aleatoire();
	}
public static int mise;
	public void saisiMise() {
		scan = new Scanner(System.in);
		System.out.println("Saisissez la mise que vous souhaitez jouer: ");
		System.out.println("1: 1");
		System.out.println("2: 5");
		System.out.println("3: 10");
		System.out.println("4: 25");
		System.out.println("5: 50");

		switch(scan.nextLine()) {
		case "1": 
			mise = 1;
			Main.jacky.Perte(1);
			break;

		case "2": 
			mise = 5;
			Main.jacky.Perte(5);
			break;

		case "3":
			mise = 10;
			Main.jacky.Perte(10);
			break;

		case "4": 
			mise = 25;
			Main.jacky.Perte(25);
			break;

		case "5": 
			mise = 50;
			Main.jacky.Perte(50);
			break;
		}		
	}

	public void saisiPlace() {
		System.out.println("Où voulez-vous miser: ");
		System.out.println("P: Pair");
		System.out.println("I: Impair");
		System.out.println("N: Noir");
		System.out.println("R: Rouge");
		System.out.println("0: 0");
		System.out.println("1M: Première moitié");
		System.out.println("2M: Deuxième moitié");
		System.out.println("1D: Première douzaine");
		System.out.println("2D: Deuxième douzaine");
		System.out.println("3D: Troisième douzaine");
		System.out.println("1C: Première colonne");
		System.out.println("2C: Deuxième colonne");
		System.out.println("3C: Troisième colonne");
		System.out.println("Ou entrez un numéro entre 1 et 36");




		switch(scan.nextLine()){
		case "P" : pair = true; break;
		case "I" : impair = true; break;
		case "N" : noir = true; break;
		case "R" : rouge = true; break;
		case "0" : zero = true; break;
		case "1M" : stmoitie = true; break;
		case "2M" : ndmoitie = true; break;
		case "1D" : stdouzaine = true; break;
		case "2D" : nddouzaine = true; break;
		case "3D" : rddouzaine = true; break;
		case "1C" : stcolonne = true; break;
		case "2C" : ndcolonne = true; break;		
		case "3C" : rdcolonne = true; break;


		}

	}


}