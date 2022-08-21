package com.xworkz.inheritance4;

public class PlasticCreate 
{
	public static void main(String[] args) 
	{
		Pipe pipe = new Pipe(200, 12.5d, "circle");
		pipe.torisu();

		Plastic plastic = new Pipe(200, 12.5d, "circle");
		Pipe converted = (Pipe) plastic;
		converted.strength = true;
		converted.color = "brown";
		converted.rate = 2754.5d;
		converted.torisu();
	}
}
