package com.xworkz.crudoperation.DTO;

import java.io.Serializable;

public class ApartmentDTO implements Serializable {

	private String name;
	private int floors;
	private boolean oneBhk;
	private boolean twoBhk;
	private String Colour;
	private boolean camera;
	private boolean compound;
	private boolean swmmingPool;
	private boolean parking;
	private boolean solar;
	private boolean lift;
	private boolean waterTank;
	private boolean secrurity;
	private boolean garden;
	private int cost;

	public ApartmentDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "ApartmentDTO [name=" + name + ", floors=" + floors + ", oneBhk=" + oneBhk + ", twoBhk=" + twoBhk
				+ ", Colour=" + Colour + ", camera=" + camera + ", compound=" + compound + ", swmmingPool="
				+ swmmingPool + ", parking=" + parking + ", solar=" + solar + ", lift=" + lift + ", waterTank="
				+ waterTank + ", secrurity=" + secrurity + ", garden=" + garden + ", cost=" + cost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isOneBhk() {
		return oneBhk;
	}

	public void setOneBhk(boolean oneBhk) {
		this.oneBhk = oneBhk;
	}

	public boolean isTwoBhk() {
		return twoBhk;
	}

	public void setTwoBhk(boolean twoBhk) {
		this.twoBhk = twoBhk;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isCompound() {
		return compound;
	}

	public void setCompound(boolean compound) {
		this.compound = compound;
	}

	public boolean isSwmmingPool() {
		return swmmingPool;
	}

	public void setSwmmingPool(boolean swmmingPool) {
		this.swmmingPool = swmmingPool;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isSolar() {
		return solar;
	}

	public void setSolar(boolean solar) {
		this.solar = solar;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isWaterTank() {
		return waterTank;
	}

	public void setWaterTank(boolean waterTank) {
		this.waterTank = waterTank;
	}

	public boolean isSecrurity() {
		return secrurity;
	}

	public void setSecrurity(boolean secrurity) {
		this.secrurity = secrurity;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
