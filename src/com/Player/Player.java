package com.Player;
import java.util.Random;

import com.*;
import com.Board.Board;

public class Player {
	private Alliance alliance;
	private int playerNumber;
	private String[] possibleNames = {"Jefferson Bot", "Billy Bot", "Suzan Bot", "Kong Bot", "Makenzy Bot", "Lora Bot", "Kitten Bot", "Dogo Bot", "Izzy Bot", "Poppy Bot", "Lisa Bot", "John Bot", "Callie Bot", "Shadow Bot", "Whiskers Bot", "Lily Bot", "Charlotte Bot", "Sylvester Bot", "Gamer99 Bot", "Kid Bot", "Alexander_The_Great Bot"};
	private String playerName;
	private Board board;// = new Board();
	private boolean isAI;

	public Player(int playerNumber, boolean isai, Board b) {
		this.playerNumber = playerNumber;
		this.isAI = isai;
		board = new Board(b);
		setAlliance();
	}

	public Player(Player p) {
		this.playerNumber = p.playerNumber;
		this.isAI = p.isAI;
		this.board = p.board;
	}

	private void setAlliance() {
		switch (playerNumber) {
		case 1:
			this.alliance = Alliance.RED;
		case 2:
			this.alliance = Alliance.BLUE;
		case 3:
			this.alliance = Alliance.GREEN;
		case 4:
			this.alliance = Alliance.YELLOW;
		}
	}


	
	public boolean equals(Player p) {
		return this.getPlayerNumber() == p.getPlayerNumber();
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerName(String name) {
		if(isAI == true) {
			Random r = new Random();
			playerName = new String(possibleNames[r.nextInt(possibleNames.length)]);
		}
		else {
			playerName = name;
		}
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getPlayerName(int PlayerNumber) {
		return playerName;
	}
	
	public void aiDraft(Board b) {
		if(isAI == true) {
			b.getCurrentPlayerOwnedCountries();
		}
	}
	
	public void setPlayerNumber(int i) {
		this.playerNumber = i;
	}

}
