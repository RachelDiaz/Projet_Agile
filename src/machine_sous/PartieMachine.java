package machine_sous;

import java.util.Scanner;

import joueur.Joueur;

public class PartieMachine {
	public PartieMachine(){
	}
	
	public int partie(Joueur j){
		Machine machine=new Machine(j);
		boolean continuer=true;
		boolean b=false;
		
		while(continuer){
			machine.tirage();		
			machine.Affichage(machine);
			System.out.println("");
			System.out.println("Bienvenue sur la machine à sous !");
			System.out.println("Le but est d'obtenir une combinaison de trois memes symboles sur la ligne du milieu parmis les combinaisons indiquées sur la machine.");
			System.out.println("");
			System.out.println("Votre solde est de "+machine.getJoueur().getMoney());
			System.out.println("Veuillez miser entre 1 et 10 euros.");
			System.out.println("Quelle est votre mise ?");
			Scanner scan = new Scanner(System.in);
			int mise = scan.nextInt();
			while(!b) {
				if(mise <11 && mise >= 1 && machine.peutMiser(mise)){
					b = true;
					break;
				} else {
					if (mise > machine.getJoueur().getMoney()) {
						System.out.println("Vous n'avez pas assez d'argent.");
						System.out.println("Veuillez choisir une mise inférieure ou égale a votre solde.");
					} else {
						System.out.println("Veuillez choisir une mise entre 1 et 10 euros.");
					}
					mise = scan.nextInt();
				}
			}
			machine.Miser(mise);
			machine.getJoueur().Perte(mise);
			machine.clearScreen();
			machine.tirage();
			machine.Affichage(machine);
			System.out.println("");
			machine.gagner();
			System.out.println("Votre gain est de "+machine.getGain()+".");
			
			System.out.println("Que choisissez-vous : 1: Encaisser vos gains  2: continuer");
			int choix = scan.nextInt();
			b=false;
			while(!b) {
				if(choix ==1){
					System.out.println("Vos gains ont été encaissés. A bientot.");
					machine.getJoueur().Gain(machine.getGain());
					b = true;
					continuer=false;
					break;
				} else if(choix ==2){
					if(machine.getJoueur().getMoney()>0) {
						System.out.println("Vous avez choisis de continuer.");
						b = true;
						break;
					}else{
						System.out.println("Vous n'avez plus assez d'argent pour continuer. ");
						choix = 1;
					}
				} else {
					System.out.println("Veuillez choisir dans les choix disponibles.");
					choix = scan.nextInt();
				}
			}
		}
		return machine.getJoueur().getMoney();
	}
	
	
	
}
