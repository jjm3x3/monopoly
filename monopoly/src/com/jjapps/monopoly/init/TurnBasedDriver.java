package com.jjapps.monopoly.init;
import java.util.Scanner;


public class TurnBasedDriver {
	private static final int NUM_PLAYERS = 4;
	
	
	public static void main(String[] args){
		Player [] owners = new Player[40];
		Player startPlayer = null;
		Player currentPlayer = null;
		System.out.println("How man Players?");
		Scanner in = new Scanner(System.in);
		int numPlayers = in.nextInt();
		
		for (int i = 0; i < numPlayers; ++i){
			if (i == 0){
				startPlayer = new Player(1);
				currentPlayer = startPlayer;
			}
			else{
				currentPlayer.setNext(new Player(i+1));
				currentPlayer = currentPlayer.getNextPlayer();
			}
			if (i + 1 == numPlayers)
				currentPlayer.setNext(startPlayer);
		}
		currentPlayer = currentPlayer.getNextPlayer();
		for(;;){
		
			in.nextLine();
			int diceRoll = TwoDice.roll();
			System.out.print(currentPlayer + ": \trolls:" + diceRoll);
			currentPlayer.move(diceRoll);
			
			System.out.println(" now on space:"+  currentPlayer.getCurrentSpace() );
			if (owners[currentPlayer.getCurrentSpace()] != null)
				System.out.println("pay up to the man:" + owners[currentPlayer.getCurrentSpace()] +"!");
			else{
				owners[currentPlayer.getCurrentSpace()] = currentPlayer;
				System.out.println("congrats on your new property!");
			}
			currentPlayer = currentPlayer.getNextPlayer();
		}
		
	}
}
