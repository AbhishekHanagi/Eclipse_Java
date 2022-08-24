package com.xworkz.accessmodifiers.sub;

import com.xworkz.accessmodifiers.automobile.Automobile;

public class HondaAutomobile extends Automobile{
	
	public double openTime;
	public double closeTime;
	
	public HondaAutomobile(double openTime,double closeTime) 
	{
		this.openTime=openTime;
		this.closeTime=closeTime;
		System.out.println("double double type Const Of HondaAutomobile");
	}
@Override
public void torisu() {
	super.torisu();
	System.out.println(this.openTime);
	System.out.println(this.closeTime);
}
}
