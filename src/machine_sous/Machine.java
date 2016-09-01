package machine_sous;

public class Machine {
	private int mise;
	private char char1;
	private char char2;
	private char char3;
	private char[] liste= new char[] {'7','*','$','?','§'};
	private int gain;
	private int jackpot = 1000;
	
	public Machine(){
		this.mise=0;
		this.setChar1(liste[0]);
		this.setChar2(liste[0]);
		this.setChar3(liste[0]);
		this.gain=0;
	}
	
	public Machine(int mise){
		this.mise=mise;
		this.setChar1(liste[0]);
		this.setChar2(liste[0]);
		this.setChar3(liste[0]);
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

	public char getChar2() {
		return char2;
	}

	public void setChar2(char char2) {
		this.char2 = char2;
	}

	public char getChar1() {
		return char1;
	}

	public void setChar1(char char1) {
		this.char1 = char1;
	}

	public char getChar3() {
		return char3;
	}

	public void setChar3(char char3) {
		this.char3 = char3;
	}
	
	public char liste(int indice){
		if (indice < 5 && indice >= 0) return this.liste[indice];
		else return '0';
	}
	
	public void tirage(){
		
	}
	
}
