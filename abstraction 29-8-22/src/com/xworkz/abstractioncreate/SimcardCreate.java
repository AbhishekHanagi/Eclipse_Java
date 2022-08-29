package com.xworkz.abstractioncreate;

import com.xworkz.abstraction.SimCard;
import com.xworkz.abstraction.postpaid.Postpaid;
import com.xworkz.abstraction.prepaid.Prepaid;

public class SimcardCreate {

	public static void main(String[] args) {

		Postpaid pre = new Postpaid();
		pre.call();
		pre.mms();
		pre.network();
		pre.sms();

		SimCard ee = new Postpaid();
		Postpaid bb = (Postpaid) ee;
		bb.call();
		bb.network();
		bb.mms();
		bb.sms();

		System.out.println("============================");

		SimCard sim = new Prepaid();
		Prepaid card = (Prepaid) sim;

		card.display();
		sim.call();
		sim.mms();
		sim.network();
		sim.sms();

	}

}
