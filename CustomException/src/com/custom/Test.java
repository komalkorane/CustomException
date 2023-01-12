package com.custom;

public class Test {

	public static void main(String[] args) {
		
		Voter v1 = new Voter("Jyoti", 364780, 16, 326472379);
		Voter v2 = new Voter("Komal", 35247, 25, 531566488);
		
		String res= validAge(v1) ? "valid voter" : "invalid voter";
		
		System.out.println(v1.getName()+ " is "+ res);
		
		
	}

	private static boolean validAge(Voter v1) {
		
		if( v1.getAge() >= 18 ) {
			
			System.out.println("valid age");
			return true;
		}
		else {
			
		 throw new InValidAgeException("Invalid age");
		}		
	
		
	}
	
	
}
