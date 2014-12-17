package com.jjapps.monopoly.init;

public abstract class AbstractProperty implements Spcae {
	
	private Player owner;
	private boolean isMortgaged;
	private int value;
	//private board Space

	@Override
	public void takeAction() {
		// TODO Auto-generated method stub

	}
	
	public abstract int getRent();
	
	

}
