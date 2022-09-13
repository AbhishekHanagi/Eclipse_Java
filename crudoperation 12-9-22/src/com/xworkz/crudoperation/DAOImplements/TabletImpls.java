package com.xworkz.crudoperation.DAOImplements;

import com.xworkz.crudoperation.DAO.TabletDAO;
import com.xworkz.crudoperation.DTO.TabletDTO;

public class TabletImpls implements TabletDAO {

	TabletDTO[] dtos = new TabletDTO[15];
	int index = 8;

	@Override
	public boolean create(TabletDTO dto) {
		this.dtos[index] = dto;
		System.out.println("Method is Created," + dto + "index into" + this.index);
		this.index++;
		return true;
	}

}
