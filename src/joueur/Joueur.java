package joueur;

public class Joueur {
	private String name;
	private int money=200;
	
	public Joueur(){
		name="Sabrina";
	}
	
	public Joueur(String name){
		this.name=name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName(){
		return name;
	}
	
	public boolean resteMoney(){
		if(money>0){
			return true;
		}else{
			return false;
		}
	}
	
	public void Gain(int gain){
		money+=gain;
	}
	
	public void Perte(int perte){
		if(perte<money){
			money-=perte;
		}else{
			money=0;
		}
		
	}
}
