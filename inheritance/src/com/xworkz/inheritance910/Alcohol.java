package com.xworkz.inheritance910;

public class Alcohol 
{
	public String name = "KF";
	public String flavour = "Aroma";
	public int price = 165;
	public double content = 38.8;
	public int quantityInMl = 650;
	
	public Alcohol() 
	{
		System.out.println("Constructor of Alcohol");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.flavour);
		System.out.println(this.price);
		System.out.println(this.content);
		System.out.println(this.quantityInMl);
	}
}
