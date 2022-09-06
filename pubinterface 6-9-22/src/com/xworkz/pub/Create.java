package com.xworkz.pub;

public class Create {

	public static void main(String[] args) {
		PubRules pubRules = new CustomerPubRules();

		DownTownPub downTownPub = new DownTownPub(pubRules);
		downTownPub.checkRules();
	}

}
