package com.jjapps.monopoly.init;
import java.util.Random;


public class TwoDice {
	
	private int numOfDoubles = 0;
	private TwoDice instance = new TwoDice();
	
	private TwoDice(){}
	
	public static int roll(){
		Random r = new Random();
		
		return (r.nextInt(6) + 1) + (r.nextInt(6) + 1);
		
	}
}
