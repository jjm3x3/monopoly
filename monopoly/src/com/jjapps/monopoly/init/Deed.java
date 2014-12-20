package com.jjapps.monopoly.init;

public abstract class Deed {
	
	private int price;
	private int spaceNumber;
	private Group group;
	private Player owner;
	
	public int getRent(){
		if (owner == null) throw new IllegalStateException();
		return determinePayment(ownsGroup());
	}
	
	public void createDeed(Group grp){
		
	}
	
	protected abstract int determinePayment(boolean goruped);

	protected abstract boolean ownsGroup();

	public boolean isOwned(){
		return owner == null;
	}
}
