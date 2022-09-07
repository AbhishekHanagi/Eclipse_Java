package com.xworkz.dao;

public class LakeCreate {

	public static void main(String[] args) {

		LakeDAOImplementor implementor = new LakeDAOImplementor();
		implementor.save("BTM Lake");
		implementor.save("Unakal Lake");
		implementor.save("Bishikere Lake");
		implementor.save("Indira Sagar Lake");
		implementor.save("Pulicat Lake");
		implementor.save("Sardar Sarovar Lake");
		implementor.save("Shivaji Sarovar Lake");
		implementor.save("Pangong Lake");
		implementor.save("Nagarjun Sagar Lake");
		implementor.save("Loktaks Lake");

		implementor.printAllLakes();

	}

}
