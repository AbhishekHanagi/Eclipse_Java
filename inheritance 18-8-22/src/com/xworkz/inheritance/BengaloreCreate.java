package com.xworkz.inheritance;

public class BengaloreCreate 
{
	public static void main(String[] args) 
	{
		Bangalore bengaluru = new Bangalore(true, "kempegowda", true);
		bengaluru.torisu();

		City city = new Bangalore(true, "kempegowda", true);
		Bangalore converted = (Bangalore) city;
		converted.area = 404.5d;
		converted.cityName = "Hubli";
		converted.population = 115800;
		converted.torisu();
	}
}


