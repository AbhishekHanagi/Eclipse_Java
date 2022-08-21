package com.xworkz.inheritance1;

public class EarthPlanetCreate 
{
	public static void main(String[] main) 
	{	
		EarthPlanet earth=new EarthPlanet(8,true,true);
		earth.torisu();
			
		Planet planet=new EarthPlanet(8,true,true);
		EarthPlanet converted=(EarthPlanet)planet;
			
		converted.planetName="mars";
		converted.planetRadius=67531;
		converted.shapeOfPlanet="spherical";
		converted.torisu();
	}
}

