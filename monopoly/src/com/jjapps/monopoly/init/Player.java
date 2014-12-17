package com.jjapps.monopoly.init;

public class Player {
	private Player next;
	private int number;
	private int currentSpace;
	
	public Player(int i){
		number = i;
		currentSpace = 0;
	}
	
	public void move(int roll){
		currentSpace = (currentSpace + roll) % 40;
	}
	
	public int getCurrentSpace(){
		return currentSpace;
	}
	
	public void setNext(Player p){
		next = p;
	}

	public Player getNextPlayer() {
		return next;
	}
	
	public String toString(){
		return number + "";
	}
	
	public boolean mortgageProperty(AbstractProperty p){
		//TODO::implement
		return false;
		
	}
}
