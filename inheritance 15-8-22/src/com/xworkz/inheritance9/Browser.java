package com.xworkz.inheritance9;

public class Browser 
{
	public String name = "Chrome";
	public String inventor = "Google";
	public boolean faster = true;
	public boolean secure = true;
	public String channel = "Beta,Canary";
	
	public Browser() 
	{
		System.out.println("Constructor of Browser");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.inventor);
		System.out.println(this.faster);
		System.out.println(this.secure);
		System.out.println(this.channel);
	}
}
