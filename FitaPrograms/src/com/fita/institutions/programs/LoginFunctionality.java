package com.fita.institutions.programs;

public class LoginFunctionality {
	
	/** Login with email and password*/
	public void login(String email, String password) {
		System.out.println("Logged in values "+ email + " " + password);
	}
	
	/** Login with mobile no and otp*/
	public void login(long mobileNo, int otp) {
		System.out.println("Logged in values "+ mobileNo + " " + otp);
	}

	public static void main(String[] args) {
		
		LoginFunctionality obj1 = new LoginFunctionality();
		obj1.login(909290027, 8982);
		
		LoginFunctionality obj2 = new LoginFunctionality();
		obj2.login("dd1410@test.com", "qwerty");
		
	}

}
