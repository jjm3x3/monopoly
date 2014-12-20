package com.jjapps.monopoly.init;

public abstract class Deed {
	
	private int price;
	private int groupNumber;
	private Player owner;
	
	public int getRent(){
		if (owner == null) throw new IllegalStateException();
		return determinePayment(ownsGroup());
		
	}
	
	protected abstract int determinePayment(boolean goruped);

	protected abstract boolean ownsGroup();

	public boolean isOwned(){
		return owner == null;
	}
}
