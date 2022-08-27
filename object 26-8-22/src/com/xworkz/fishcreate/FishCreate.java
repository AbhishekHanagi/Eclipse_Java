package com.xworkz.fishcreate;

import com.xworkz.object.Fish;

public class FishCreate {

	public static void main(String[] args) {

		Fish fish = new Fish("Shark", "Sea Water");
		// to String method
		String method = fish.toString();
		System.out.println(method);
		System.out.println(fish.getBreed());
		System.out.println(fish.getType());

		Fish fish1 = new Fish("Murrel", "Fresh Water");
		System.out.println(fish1);
		System.out.println(fish.getBreed());
		System.out.println(fish.getType());

		fish = fish1;
		boolean compare = fish.equals(fish1);
		System.out.println(compare);

	}

}