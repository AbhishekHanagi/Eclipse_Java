package com.xworkz.crudoperation.DAOImplements;

import com.xworkz.crudoperation.DAO.SpeakerDAO;
import com.xworkz.crudoperation.DTO.SpeakerDTO;

public class SpeakerImpls implements SpeakerDAO {

	SpeakerDTO[] dto= new SpeakerDTO[15];
	int index = 5;
	
	@Override
	public boolean create(SpeakerDTO dto) {
		System.out.println("Method is Created," + dto + "index into" + this.index);
		this.index++;
		return false;
	}

}
