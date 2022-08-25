package com.xworkz.trainercreate;

import com.xworkz.encapsulation.Trainer;
import com.xworkz.omkar.Omkarsir;

public class TrainerCreate {

	public static void main(String[] args) {
		Omkarsir om = new Omkarsir(); // object creation
		om.training(); // runtime polymorphism
		om.coding();
		om.conductinginterview();
		System.out.println(om.getName());
		System.out.println(om.getExp());
		System.out.println(om.getspecialization());

		Trainer trainee = new Omkarsir();
		trainee.getName();
		trainee.getExp();
		trainee.getspecialization();

	}

}
