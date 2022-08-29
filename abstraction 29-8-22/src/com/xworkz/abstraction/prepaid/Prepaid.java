package com.xworkz.abstraction.prepaid;

import com.xworkz.abstraction.SimCard;

public class Prepaid extends SimCard {

	@Override
	public void call() {
		System.out.println("Call Service Is Available");

	}

	@Override
	public void sms() {
		System.out.println("SMS Service Is Available");

	}

	@Override
	public void network() {
		System.out.println("Network Is Available");

	}

	@Override
	public void mms() {
		System.out.println("MMS Available");

	}

	public void display() {
		System.out.println("Abstraction class");
	}

}
