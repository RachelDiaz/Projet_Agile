package machine_sous;

import java.util.Random;

public class Machine {
	private int mise;
	private Character Character1;
	private Character Character2;
	private Character Character3;
	private Character[] liste= new Character[] {'7','*','$','?','§'};
	private int gain;
	private int jackpot = 1000;
	
	public Machine(){
		this.mise=0;
		this.setCharacter1(liste[0]);
		this.setCharacter2(liste[0]);
		this.setCharacter3(liste[0]);
		this.gain=0;
	}
	
	public Machine(int mise){
		this.mise=mise;
		this.setCharacter1(liste[0]);
		this.setCharacter2(liste[0]);
		this.setCharacter3(liste[0]);
		this.gain=0;
	}
	
	public void Miser(int mise){
		if (mise < 0) this.mise = 0;
		else if (mise > 10) this.mise=10;
		else this.mise=mise;
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
	
	public int Alea(){
		Random alea = new Random();
		int nombre = alea.nextInt(100);
		if (nombre < 45)  return 4;
		else if (nombre < 70)  return 3;
		else if (nombre < 85)  return 2;
		else if (nombre < 95)  return 1;
		else return 0;
	}
	
	public void tirage(){
		int indice;
		for(int i=0; i<3;i++){
			indice=this.Alea();
			if (i==0) this.Character1=this.liste[indice];
			else if(i==1) this.Character2=this.liste[indice];
			else this.Character1=this.liste[indice];
		}
	}
	
	public boolean gagner(){
		if (this.getCharacter1().equals(this.getCharacter2()) && this.getCharacter1().equals(this.getCharacter3())) return true;
		else return false;
	}
	
	
	
	public static void main(String[]args){
		Machine machine=new Machine();
		machine.tirage();
		System.out.print(machine.getCharacter1()+" | "+machine.getCharacter2()+" | "+machine.getCharacter3());
		
	}
	
	
	
	
	
}
