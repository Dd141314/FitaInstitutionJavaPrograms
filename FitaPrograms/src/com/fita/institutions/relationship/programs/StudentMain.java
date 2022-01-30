package com.fita.institutions.relationship.programs;

public class StudentMain {

	public static void main(String[] args) {
		Institutions institution1 = new Institutions(1, "FITA", "Saravanampatty", 4);
		System.out.println(institution1.toString());
		
		Institutions institution2 = new Institutions(2, "ThoughtWorks", "Saravanampatty", 10);
		System.out.println(institution2.toString());
		
		Students student1 = new Students(1, "Pavithra", 20, "12-10-1221", institution1);
		System.out.println(student1.toString());
		
		Students student2 = new Students(2, "Ritwik", 20, "12-10-1211", institution1);
		System.out.println(student2.toString());
		
		Students student3 = new Students(3, "Dharani", 20, "14-10-1211", institution2);
		System.out.println(student3.toString());


	}

}
