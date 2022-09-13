package com.xworkz.crudoperation.DTO;

public class TabletDTO {

	private String name;
	private String colour;
	private String shape;
	private String company;
	private int weight;
	private int mg;
	private int price;
	private int mfgDate;
	private int expDate;
	private int noOfTabletsInStrip;
	private boolean fishOil;
	private boolean harmFull;
	private boolean keepAwayFromChildren;
	private boolean boxPacking;
	private boolean sunLightProtection;

	public TabletDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "TabletDTO [name=" + name + ", colour=" + colour + ", shape=" + shape + ", company=" + company
				+ ", weight=" + weight + ", mg=" + mg + ", price=" + price + ", mfgDate=" + mfgDate + ", expDate="
				+ expDate + ", noOfTabletsInStrip=" + noOfTabletsInStrip + ", fishOil=" + fishOil + ", harmFull="
				+ harmFull + ", keepAwayChildren=" + keepAwayFromChildren + ", boxPacking=" + boxPacking
				+ ", sunLightProtection=" + sunLightProtection + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMg() {
		return mg;
	}

	public void setMg(int mg) {
		this.mg = mg;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(int mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getExpDate() {
		return expDate;
	}

	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}

	public int getNoOfTabletsInStrip() {
		return noOfTabletsInStrip;
	}

	public void setNoOfTabletsInStrip(int noOfTabletsInStrip) {
		this.noOfTabletsInStrip = noOfTabletsInStrip;
	}

	public boolean isFishOil() {
		return fishOil;
	}

	public void setFishOil(boolean fishOil) {
		this.fishOil = fishOil;
	}

	public boolean isHarmFull() {
		return harmFull;
	}

	public void setHarmFull(boolean harmFull) {
		this.harmFull = harmFull;
	}

	public boolean isKeepAwayChildren() {
		return keepAwayFromChildren;
	}

	public void setKeepAwayChildren(boolean keepAwayChildren) {
		this.keepAwayFromChildren = keepAwayChildren;
	}

	public boolean isBoxPacking() {
		return boxPacking;
	}

	public void setBoxPacking(boolean boxPacking) {
		this.boxPacking = boxPacking;
	}

	public boolean isSunLightProtection() {
		return sunLightProtection;
	}

	public void setSunLightProtection(boolean sunLightProtection) {
		this.sunLightProtection = sunLightProtection;
	}

}
