package com.xworkz.abstraction.postpaid;

import com.xworkz.abstraction.SimCard;

public class Postpaid extends SimCard {

	@Override
	public void call() {
		System.out.println("Call Service Not Available");

	}

	@Override
	public void sms() {
		System.out.println("Sms Service Is Not Avilable");

	}

	@Override
	public void network() {
		System.out.println("Network Is Not Available");

	}

	@Override
	public void mms() {
		System.out.println("MMS Sometime Not Avilable");

	}

	public void display() {
		System.out.println("Abstraction class");
	}

}
