package com.fita.institutions.relationship.programs;


public class Institutions {
	
	private int id;
	private String name;
	private String address;
	private int noOfStudents;
	
	
	public Institutions(int id, String name, String address, int noOfStudents) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.noOfStudents = noOfStudents;
	}


	@Override
	public String toString() {
		return "Institutions [id=" + id + ", name=" + name + ", address=" + address + ", noOfStudents=" + noOfStudents
				+ "]";
	}
	
	
	

}
