package com.xworkz.inheritance;

public class Bangalore extends City 
{
	public boolean capital;
	public String founder;
	public boolean gardenCity;

	public Bangalore(boolean capital, String founder, boolean gardenCity) 
	{
		super("Bangalore", 751.45d, 13193000);
		System.out.println("costruction of Bangalore");
		
		this.capital = capital;
		this.founder = founder;
		this.gardenCity = gardenCity;
		super.area = area;
		super.cityName = cityName;
		super.population = population;
		}

	public void torisu() 
	{
		System.out.println(this.capital);
		System.out.println(this.founder);
		System.out.println(this.gardenCity);
		System.out.println(this.area);
		System.out.println(this.cityName);
		System.out.println(this.population);
		System.out.println("===============");
	}
}
