package com.xworkz.object;

public class Fish {
	private String breed;
	private String type;

	public Fish() {

		System.out.println("Default Constructor");

	}

	public Fish(String breed, String type) {
		this.breed = breed;
		this.type = type;

	}

	public String getBreed() {  //getter
		return breed;

	}

	public String getType() {  //getter
		return type;
	}

	@Override
	public String toString() {
		return super.toString();

	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object null");
			if (obj instanceof Fish) {
				System.out.println("object is fish");
				Fish converted = (Fish) obj;  // type casting
				String convertedBreed = converted.breed;
				String convertedType = converted.type;
				if (this.breed.equals(convertedBreed) && this.type.equals(convertedType)) {

					System.out.println("Fish is equal");
					return true;
				}

				else {
					System.out.println("Fish is not equal");
				}

			} else {
				System.out.println("Fish is not null");
			}

		}

		return super.equals(obj);
	}

}