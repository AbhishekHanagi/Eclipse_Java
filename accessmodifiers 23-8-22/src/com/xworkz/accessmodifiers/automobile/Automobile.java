package com.xworkz.accessmodifiers.automobile;

public class Automobile 
{
	public String type; 
	public String brand;
	
	protected Automobile()  
	{
		System.out.println("Default Cont. Of AutoMobile");
	}
	
	public void setType(String type) { 
		this.type=type;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public double sellAccessories(String name) {
		return 1500;
	}
	public void torisu() {
		System.out.println(this.type);
		System.out.println(this.brand);
	
	}
}
