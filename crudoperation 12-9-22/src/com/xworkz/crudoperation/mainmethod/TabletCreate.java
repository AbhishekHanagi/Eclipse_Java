package com.xworkz.crudoperation.mainmethod;

import com.xworkz.crudoperation.DAO.TabletDAO;
import com.xworkz.crudoperation.DAOImplements.TabletImpls;
import com.xworkz.crudoperation.DTO.TabletDTO;

public class TabletCreate {

	public static void main(String[] args) {

		TabletDTO tabletDTO = new TabletDTO();
		tabletDTO.setName("DOLO 650");
		tabletDTO.setColour("White");
		tabletDTO.setShape("Round");
		tabletDTO.setCompany("Micro Lab");
		tabletDTO.setWeight(20);
		tabletDTO.setMg(650);
		tabletDTO.setPrice(31);
		tabletDTO.setMfgDate(12822);
		tabletDTO.setExpDate(25526);
		tabletDTO.setNoOfTabletsInStrip(10);
		tabletDTO.setFishOil(false);
		tabletDTO.setHarmFull(false);
		tabletDTO.setKeepAwayChildren(true);
		tabletDTO.setBoxPacking(false);
		tabletDTO.setSunLightProtection(false);

		TabletDAO dao = new TabletImpls();
		dao.create(tabletDTO);
	}
}
