package com.xworkz.crudoperation.mainmethod;

import com.xworkz.crudoperation.DAO.MovieDAO;
import com.xworkz.crudoperation.DAOImplements.MovieImpls;
import com.xworkz.crudoperation.DTO.MovieDTO;

public class MovieCreate {

	public static void main(String[] args) {

		MovieDTO dto = new MovieDTO();
		dto.setName("Charlie 777");
		dto.setType("Animal Love");
		dto.setHeroName("Rakshit Shetty");
		dto.setHeroinenName("Sangeetha");
		dto.setDirectorName("Rakshit Shetty");
		dto.setBudget(200000000);
		dto.setMovieDuration(3);
		dto.setMovieMakingDuration(3);
		dto.setNoOfMainActors(8);
		dto.setNoOfSideActors(28);
		dto.setNoOfComedyActors(0);
		dto.setCollection(1000000000);
		dto.setHorror(false);
		dto.setBoring(false);

		MovieDAO dao = new MovieImpls();
		dao.create(dto);
	}
}

