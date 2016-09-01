package Roulette;
import Main.*;

import java.util.Scanner;

public class ChoixMise {
	private Scanner scan;
	public ChoixMise() {
		
	}
	
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
			Main.jacky.Perte(1);
			break;
			
		case "2": 
			Main.jacky.Perte(5);
			break;
			
		case "3": 
			Main.jacky.Perte(10);
			break;
			
		case "4": 
			Main.jacky.Perte(25);
			break;
			
		case "5": 
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
		System.out.println("Ou entrez un numéro entre 1 et 36");
		
	}
}