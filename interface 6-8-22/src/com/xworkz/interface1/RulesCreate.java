package com.xworkz.interface1;

public class RulesCreate {

	public static void main(String[] args) {
		ItRulesFollower itRulesFollower = new ItRulesFollower();
		itRulesFollower.applyLevels();
		itRulesFollower.harrasment();
		itRulesFollower.informLevel();
		itRulesFollower.parkingApproval();
		itRulesFollower.swipeCard();
		itRulesFollower.workFromHome();
		
		System.out.println("===============================");

		ManagerRules itRulesFollower2 = new ItRulesFollower();
		itRulesFollower2.informLevel();
		itRulesFollower2.workFromHome();
		
		System.out.println("===============================");

		SecurityRules itRulesFollower3 = new ItRulesFollower();
		itRulesFollower3.parkingApproval();
		itRulesFollower3.swipeCard();
		
		System.out.println("===============================");
		
		HrRules itRulesFollower4 = new ItRulesFollower();
		itRulesFollower4.harrasment();
		itRulesFollower4.applyLevels();
	}
}
