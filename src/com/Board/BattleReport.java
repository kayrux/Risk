package com.Board;

public class BattleReport {

	private int attackingTroopsLost;
	private int defendingTroopsLost;
	private boolean victorious;
	
	
	public BattleReport(int atkTroopsLost, int dfndTroopsLost, boolean won) {
		this.attackingTroopsLost = atkTroopsLost;
		this.defendingTroopsLost = dfndTroopsLost;
		this.victorious = won;
		if (victorious) {
			System.out.println("Victory!"
					+ "\nYou have lost:" + atkTroopsLost + " troops.\n");
		} else {
			System.out.println("Defeat!"
					+ "\n You have lost:" + atkTroopsLost + " troops."
					+ "\n Your enemy has lost:" + dfndTroopsLost + " troops \n");
		}
	}

	public int getAttackingTroopsLost() {
		return attackingTroopsLost;
	}

	public void setAttackingTroopsLost(int attackingTroopsLost) {
		this.attackingTroopsLost = attackingTroopsLost;
	}

	public int getDefendingTroopsLost() {
		return defendingTroopsLost;
	}

	public void setDefendingTroopsLost(int defendingTroopsLost) {
		this.defendingTroopsLost = defendingTroopsLost;
	}

	public boolean isVictorious() {
		return victorious;
	}

	public void setVictorious(boolean victorious) {
		this.victorious = victorious;
	}
	
	
}
