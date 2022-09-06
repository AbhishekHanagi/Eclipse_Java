package com.xworkz.temple;

public class Follower implements TempleRules {

	@Override
	public boolean openTime() {
		System.out.println("Running Open Time");
		return true;
	}

	@Override
	public boolean dress() {
		System.out.println("Running Dress Code");
		return false;
	}

	@Override
	public boolean prasad() {
		System.out.println("Running Prasad");
		return true;
	}

}
