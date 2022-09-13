package com.xworkz.crudoperation.DAOImplements;

import com.xworkz.crudoperation.DAO.ApartmentDAO;
import com.xworkz.crudoperation.DTO.ApartmentDTO;

public class ApartmentImpls implements ApartmentDAO {

	ApartmentDTO[] dtos = new ApartmentDTO[15];
	int index = 4;

	@Override
	public boolean create(ApartmentDTO dto) {
		this.dtos[index] = dto;
		System.out.println("Method is Created," + dto + "index into" + this.index);
		this.index++;
		return true;
	}

}
