package com.fita.institutions.relationship.programs;

public class Students {
	
	private int id;
	private String name;
	private int age;
	private String dob;
	private Institutions institutions;
	
	public Students(int id, String name, int age, String dob, Institutions institutions) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.institutions = institutions;
	}
	

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", institutions="
				+ institutions + "]";
	}
	
	
	
	

}
