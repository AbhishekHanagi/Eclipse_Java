package com.xworkz.crudoperation.mainmethod;

import com.xworkz.crudoperation.DAO.SpeakerDAO;
import com.xworkz.crudoperation.DAOImplements.SpeakerImpls;
import com.xworkz.crudoperation.DTO.SpeakerDTO;

public class SpeakerCreate {

	public static void main(String[] args) {

		SpeakerDTO speakerDTO = new SpeakerDTO();
		speakerDTO.setName("MS511");
		speakerDTO.setBrand("Philips");
		speakerDTO.setShape("Rectangular");
		speakerDTO.setColour("Black");
		speakerDTO.setVolumeUpto(100);
		speakerDTO.setPrice(7000);
		speakerDTO.setGuarntee(true);
		speakerDTO.setWoofer(true);
		speakerDTO.setNoOfSpeakers(4);
		speakerDTO.setRemote(true);
		speakerDTO.setBass(true);
		speakerDTO.setButton(true);
		speakerDTO.setLighting(false);
		speakerDTO.setFm(true);
		speakerDTO.setUsb(true);

		SpeakerDAO dao = new SpeakerImpls();
		dao.create(speakerDTO);
	}

}
