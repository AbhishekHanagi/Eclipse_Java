package com.xworkz.temple;

public class Users {

	private TempleRules rules;

	//public Users() {}  (In Case Of Default Constructor We Got Null Point Excepetion)    

	public Users(TempleRules rules) {
		this.rules = rules;
		System.out.println("Creating Constructor");
	}

	public void checkRules() {
		boolean openTime = this.rules.openTime();
		boolean dress = this.rules.dress();
		boolean prasad = this.rules.prasad();
		if (openTime && dress && prasad) {
			System.out.println("Following The Temple Rules");
		} else {
			System.err.println("Not Following The Temple Rules");
		}
	}

}