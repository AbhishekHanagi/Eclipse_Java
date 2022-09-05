package com.xworkz.interface1;

public class ItRulesFollower implements ManagerRules, SecurityRules, HrRules {

	@Override
	public boolean applyLevels() {
		System.out.println("Running applylevels");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("Running harrasment");
		return false;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("Running swipecard");
		return false;
	}

	@Override
	public boolean parkingApproval() {
		System.out.println("Running Parking Approval");
		return false;
	}

	@Override
	public boolean informLevel() {
		System.out.println("Running Inform Level");
		return false;
	}

	@Override
	public boolean workFromHome() {
		System.out.println("Running Work From Home");
		return false;
	}

}
