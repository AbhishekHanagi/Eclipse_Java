package com.xworkz.dao;

public interface LakeDAO {
	
	String[] lakeNames = new String[10];

	boolean save(String lakeName);

	void printAllLakes();

}
