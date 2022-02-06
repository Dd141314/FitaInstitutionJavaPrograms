package com.fita.institutions.relationship.programs;

public class PlayerMain {

	public static void main(String[] args) {
		
		Team cskTeam = new Team(1,"CSK","Fleming");
		System.out.println(cskTeam.toString());
		
		
		Player p1 = new Player(1,"Dhoni",cskTeam);
		System.out.println(p1.toString());
		
		Player p2 = new Player(2,"Raina",cskTeam);
		System.out.println(p2.toString());
		
		Team rcbTeam = new Team(2,"RCB","ABD");
		System.out.println(rcbTeam.toString());
		Player p3 = new Player(1,"Kholi",rcbTeam);
		System.out.println(p3.toString());
		Player p4 = new Player(2,"Chahal",rcbTeam);
		System.out.println(p4.toString());
		

	}

}
