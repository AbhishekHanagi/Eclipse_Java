package com.xworkz.temple;

public class Create {

	public static void main(String[] args) {

		TempleRules rules = new Follower();
		
		Users users = new Users(rules);
		users.checkRules();
	}

}
