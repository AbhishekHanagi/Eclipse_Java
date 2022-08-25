package com.xworkz.encapsulation;

public class Trainer {
	protected String name;
	protected int exp;
	protected String specialization;

	protected void training() {  //method
		System.out.println("Parent: Omkar Sir is a Trainer");
	}

	protected void conductinginterview() {  //method
		System.out.println("Parent: Interview Time");
	}

	protected void coding() {  //method
		System.out.println("Parent: Java Coding");
	}
	
	protected Trainer() {  //Default Constructor
		System.out.println("Def Parent Constructor");
	}
	
	protected Trainer(String name, int exp, String specialization) {  // parameterized Constructor
		this.name=name;
		this.exp=exp;
		this.specialization=specialization;
	}
	
	public String getName() {  //getter 
		System.out.println("Name Of Trainer");
		return "Omkar Sir";
	}
	
	public int getExp() {  //getter
		System.out.println("Year of Exp");
		return 14;
	}
	
	public String getspecialization() {  //getter
		System.out.println("Stringspecialization in ");
		return "Developer";
	}
}
