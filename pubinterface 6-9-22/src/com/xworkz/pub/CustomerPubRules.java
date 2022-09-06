package com.xworkz.pub;

public class CustomerPubRules implements PubRules {

	@Override
	public boolean dressCodeFollowed() {
		System.out.println("Runnig Dress Code Followed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("Running Age");
		return 25;
	}

	@Override
	public boolean validProff() {
		System.out.println("Running Valid Proff");
		return true;
	}

}
