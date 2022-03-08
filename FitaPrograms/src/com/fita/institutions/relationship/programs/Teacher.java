package com.fita.institutions.relationship.programs;

public class Teacher {
	
	private String name;
	private int age;
	private String subjectsHandling;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String subjectsHandling) {
		this.name = name;
		this.age = age;
		this.subjectsHandling = subjectsHandling;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	

	public String getSubjectsHandling() {
		return subjectsHandling;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubjectsHandling(String subjectsHandling) {
		this.subjectsHandling = subjectsHandling;
	}
	
	public String toString() {
		return String.format("Name: %s , Age: %s , Mark: %s", this.name,this.age,this.subjectsHandling);
	}
	
	
	
	

}
