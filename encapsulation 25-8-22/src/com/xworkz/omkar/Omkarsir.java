package com.xworkz.omkar;

import com.xworkz.encapsulation.Trainer;

public class Omkarsir extends Trainer {

	public Omkarsir() {
		System.out.println("Child: Def Constructor");
	}

	public Omkarsir(String name, int exp, String specialization) {
		System.out.println();
		super.name = name; // super(name,exp,Spc);
		super.exp = exp;
		super.specialization = specialization;
	}

	@Override
	public void training() {
		System.out.println("Omkar Sir Is A Very Humble Person");
	}

	@Override
	public void conductinginterview() {
		System.out.println("Conducting Interview at Weekend");
	}

	@Override
	public void coding() {
		System.out.println("Java Coding is Easy Language");
	}
}
