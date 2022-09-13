package com.xworkz.crudoperation.mainmethod;

import com.xworkz.crudoperation.DAO.ApartmentDAO;
import com.xworkz.crudoperation.DAOImplements.ApartmentImpls;
import com.xworkz.crudoperation.DTO.ApartmentDTO;

public class ApartmentCreate {

	public static void main(String[] args) {

		ApartmentDTO apartmentDTO = new ApartmentDTO();
		apartmentDTO.setName("Vaibhavi Residency");
		apartmentDTO.setFloors(4);
		apartmentDTO.setOneBhk(true);
		apartmentDTO.setTwoBhk(true);
		apartmentDTO.setColour("Cream Colour");
		apartmentDTO.setCamera(true);
		apartmentDTO.setCompound(true);
		apartmentDTO.setSwmmingPool(false);
		apartmentDTO.setParking(true);
		apartmentDTO.setSolar(true);
		apartmentDTO.setLift(true);
		apartmentDTO.setWaterTank(true);
		apartmentDTO.setSecrurity(true);
		apartmentDTO.setGarden(true);
		apartmentDTO.setCost(356000000);

		ApartmentDAO dao = new ApartmentImpls();
		dao.create(apartmentDTO);

	}
}
