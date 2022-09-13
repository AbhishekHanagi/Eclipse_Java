package com.xworkz.crudoperation.DTO;

public class SpeakerDTO {

	private String name;
	private String brand;
	private String shape;
	private String colour;
	private int volumeUpto;
	private int price;
	private boolean guarntee;
	private boolean woofer;
	private int noOfSpeakers;
	private boolean remote;
	private boolean bass;
	private boolean button;
	private boolean lighting;
	private boolean fm;
	private boolean usb;

	public SpeakerDTO() {
		System.out.println("Default Constructor");

	}

	@Override
	public String toString() {
		return "Speaker [name=" + name + ", brand=" + brand + ", shape=" + shape + ", colour=" + colour
				+ ", volumeUpto=" + volumeUpto + ", price=" + price + ", guarntee=" + guarntee + ", woofer=" + woofer
				+ ", noOfSpeakers=" + noOfSpeakers + ", remote=" + remote + ", bass=" + bass + ", button=" + button
				+ ", lighting=" + lighting + ", fm=" + fm + ", usb=" + usb + "]";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getVolumeUpto() {
		return volumeUpto;
	}

	public void setVolumeUpto(int volumeUpto) {
		this.volumeUpto = volumeUpto;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isGuarntee() {
		return guarntee;
	}

	public void setGuarntee(boolean guarntee) {
		this.guarntee = guarntee;
	}

	public boolean isWoofer() {
		return woofer;
	}

	public void setWoofer(boolean woofer) {
		this.woofer = woofer;
	}

	public int getNoOfSpeakers() {
		return noOfSpeakers;
	}

	public void setNoOfSpeakers(int noOfSpeakers) {
		this.noOfSpeakers = noOfSpeakers;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

	public boolean isLighting() {
		return lighting;
	}

	public void setLighting(boolean lighting) {
		this.lighting = lighting;
	}

	public boolean isFm() {
		return fm;
	}

	public void setFm(boolean fm) {
		this.fm = fm;
	}

	public boolean isUsb() {
		return usb;
	}

	public void setUsb(boolean usb) {
		this.usb = usb;
	}

}
