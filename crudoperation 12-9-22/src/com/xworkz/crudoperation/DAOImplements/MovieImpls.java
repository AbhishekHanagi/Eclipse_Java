package com.xworkz.crudoperation.DAOImplements;

import com.xworkz.crudoperation.DAO.MovieDAO;
import com.xworkz.crudoperation.DTO.MovieDTO;

public class MovieImpls implements MovieDAO {

	@Override
	public boolean create(MovieDTO dto) {
		System.out.println("Method Is Created," + dto);
		return false;
	}

}
