package com.fita.institutions.relationship.programs;

/**
 * 
 * HAS - A Relationship
 *
 */

public class Team {
	
	private int teamId;
	private String teamName;
	private String coachName;
	
	public Team() {
		
	}

	public Team(int teamId, String teamName, String coachName) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", coachName=" + coachName + "]";
	}
	
	
	
}
