package joueur;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;



public class Joueur {
	
	private String name;
	private int money=200;
	private String code;
	
	public Joueur(){
		name="Sabrina";
		code="200";
		
		
	}
	
	public Joueur(String name){
		this.name=name;
				
	}
		
	public Joueur(String name,String code){
		this.name=name;
		this.code=code;
				
	}
		
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
