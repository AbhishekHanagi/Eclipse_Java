package com.xworkz.accessmodifiers.create;

import com.xworkz.accessmodifiers.automobile.Automobile;
import com.xworkz.accessmodifiers.sub.HondaAutomobile;
import com.xworkz.accessmodifiers.sub1.TataAutomobile;

public class AutomobileCreate 
{
	public static void main(String[] args) {
	//Automobile automobile=new Automobile();
		System.out.println("=================");
	Automobile automobile2=new HondaAutomobile(9.30,5.30);
	System.out.println("==============");
	double am=automobile2.sellAccessories("Head Light");
	System.out.println(am);
	automobile2.setType("two wheeler");
	 automobile2.setBrand("hero");
	 automobile2.torisu();
	 System.out.println("=================");
	//Automobile automobile3=new TataAutomobile();
	 System.out.println("=============");
	HondaAutomobile honda=new HondaAutomobile(10.30, 6.30);
     honda.setType("Four wheeler");
     honda.setBrand("honda");
     honda.torisu();
     System.out.println("============");
	TataAutomobile tata=new TataAutomobile();
	tata.setType("four wheeler");
	tata.setBrand("tata");
	tata.torisu();
}
	
}
