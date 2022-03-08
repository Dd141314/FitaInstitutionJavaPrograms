package com.fita.institutions.relationship.programs;

public class TeacherDetails {

	public static void main(String[] args) {
		
		String[] names = {"Pavithra","Prakash","Ram","Dharani"};
		int[] age = {10,20,30};
		
		for(int i = 0; i < names.length ; i++) {
			Teacher obj = new Teacher();
			obj.setName(names[i]);
			obj.setAge(age[i]);
		}
		
		Teacher obj = new Teacher();
		obj.setName("Pavithra");

	}

}
