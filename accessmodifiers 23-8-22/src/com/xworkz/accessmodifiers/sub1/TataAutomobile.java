package com.xworkz.accessmodifiers.sub1;

import com.xworkz.accessmodifiers.automobile.Automobile;

public class TataAutomobile extends Automobile {
	
	public TataAutomobile() {
		System.out.println("default const. of tatamobile");
	}
@Override
	public void torisu() {
    super.torisu();
	}
}
