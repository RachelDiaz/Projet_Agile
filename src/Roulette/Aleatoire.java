package Roulette;

import java.util.Random;

import javax.print.attribute.standard.Chromaticity;

import org.w3c.dom.traversal.NodeIterator;

import Main.Main;

public class Aleatoire {
	int[] tab_rouge = new int[] { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
	//int[] tab_noir = new int[] {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

	int[] tab_pair = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
	//int[] tab_impair = new int[] {}

	int[] deuxiemecolonne = new int[] {2,5,8,11,14,17,20,23,26,29,32,35};

	int[] troisiemecolonne = new int[] {1,4,7,10,13,16,19,22,25,28,31,34};

	boolean rouge;
	boolean pair;
	boolean noir;
	boolean impair;
	boolean passe;
	boolean manque;
	boolean firstD;
	boolean secondD;
	boolean firstcolumn; 
	boolean secondcolumn;
	boolean thirdcolumn;
	boolean thirdD;
	Random r = new Random();
	int nbr = r.nextInt(36);
	
	public Aleatoire(){
		lancer();
		check_with_mise();
	}
	public void lancer() {

		
		rouge = isRouge(nbr);
		if(!rouge){
			noir = true;
		}
		pair = isPair(nbr);
		if(!pair){
			impair = true;
		}
		manque = isManque(nbr);
		if(!manque){
			passe = true;
		}
		firstD = is1D(nbr);
		secondD = is2D(nbr);
		thirdD = is3D(nbr);
		firstcolumn = is1C(nbr);
		secondcolumn = is2C(nbr);
		thirdcolumn = is3C(nbr);


	}
	public void check_with_mise(){
		int multiplicateur = 1;
		boolean good = false;
		if((ChoixMise.pair && pair ) == true){
			multiplicateur *= 2;
			good = true;
		}
		else if((ChoixMise.impair && impair ) == true){
			multiplicateur *= 2;		
			good = true;

		}
		else if((ChoixMise.rouge && rouge) == true){
			multiplicateur *= 2;
			good = true;

		}
		else if((ChoixMise.noir && noir) == true){
			multiplicateur *= 2;
			good = true;	
		}
		else if((ChoixMise.stmoitie && manque) == true){
			multiplicateur *= 2;
		}
		else if((ChoixMise.ndmoitie && passe) == true){
			multiplicateur *= 2;
			good = true;
		}
		else if((ChoixMise.stdouzaine && firstD)== true){
			multiplicateur *= 3;
			good = true;
		}
		else if((ChoixMise.nddouzaine && secondD)== true){
			multiplicateur *= 3;
			good = true;
		}
		else if((ChoixMise.rddouzaine && thirdD)== true){
			multiplicateur *= 3;
			good = true;
		}
		else if((ChoixMise.stcolonne && firstcolumn)== true){
			multiplicateur *= 3;
			good = true;
		}
		else if((ChoixMise.ndcolonne && secondcolumn)== true){
			multiplicateur *= 3;
			good = true;
		}
		else if((ChoixMise.rdcolonne && thirdcolumn)== true){
			multiplicateur *= 3;
			good = true;
		}
		if(good)
		Main.jacky.Gain(ChoixMise.mise * multiplicateur);
		System.out.println("Rien ne va plus ! \nLe numero tiré est " + nbr);
		System.out.println("Vous possedez " + Main.jacky.getMoney() + " jetons");
	}

	boolean isRouge(int nbrs){
		boolean estRouge = false;
		for (int Rouge : tab_rouge) {
			if (Rouge == nbrs) {
				estRouge = true;
			}
		}
		return estRouge;
	}

	boolean isPair(int nbrs){
		if(nbrs%2 == 0)
			return true;
		else return false;
	}

	boolean isManque(int nbr){
		if(nbr < 19){
			return true;
		}
		return false;
	}


	boolean is1D(int nbr){
		if(nbr >= 1 && nbr <= 12){
			return true;
		}
		return false;
	}

	boolean is2D(int nbr){
		if(nbr >= 13 && nbr <= 24){
			return true;
		}
		return false;
	}

	boolean is3D(int nbr){
		if(nbr >= 25 && nbr <= 36){
			return true;
		}
		return false;
	}

	boolean is1C(int nbr){
		if(nbr%3 == 0){
			return true;
		}
		return false;
	}


	boolean is2C(int nbrs){
		boolean est2D = false;
		for (int second : deuxiemecolonne) {
			if (second == nbrs) {
				est2D = true;
			}
		}
		return est2D;
	}

	boolean is3C(int nbrs){
		boolean est3D = false;
		for (int trois : troisiemecolonne) {
			if (trois == nbrs) {
				est3D = true;
			}
		}
		return est3D;
	}

	boolean isZero(int nbrs){
		if(nbrs == 0)
			return true;
		return false;
	}
}

