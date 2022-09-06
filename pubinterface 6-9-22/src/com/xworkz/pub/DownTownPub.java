package com.xworkz.pub;

public class DownTownPub {

	private PubRules pubRules;

	public DownTownPub(PubRules pubRules) {
		this.pubRules = pubRules;
		System.out.println("Contructor Created");
	}

	boolean checkRules() {
		boolean dressCodeFollowed = this.pubRules.dressCodeFollowed();
		boolean validProff = this.pubRules.validProff();
		int age = this.pubRules.age();
		if (dressCodeFollowed && validProff && age > 21) {
			System.out.println("Following The Rules");
		} else {
			System.out.println("Rules are not Followed");
		}
		return true;
	}

}
