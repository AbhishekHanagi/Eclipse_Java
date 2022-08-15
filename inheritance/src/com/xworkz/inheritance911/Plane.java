package com.xworkz.inheritance911;

public class Plane 
{
	public String name = "Army";
	public int noOfSeats = 25;
	public int price = 60000000;
	public boolean gun = true;
	public int noOfWings = 3;
	
	public Plane() 
	{
		System.out.println("Constructor of Plane");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.noOfSeats);
		System.out.println(this.price);
		System.out.println(this.gun);
		System.out.println(this.noOfWings);
	}
}
