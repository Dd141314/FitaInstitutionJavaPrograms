package com.fita.institutions.relationship.programs;

public class Player {

	private int playerId;
	private String playerName;
	private Team playerTeam;
	
	public Player() {
		
	}

	public Player(int playerId, String playerName, Team playerTeam) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerTeam = playerTeam;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerTeam=" + playerTeam + "]";
	}
	
	
}
