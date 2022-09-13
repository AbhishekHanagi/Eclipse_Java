package com.xworkz.crudoperation.DTO;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String name;
	private String type;
	private String heroName;
	private String heroinenName;
	private String directorName;
	private boolean ProducerName;
	private int budget;
	private double movieDuration;
	private int movieMakingDuration;
	private int noOfMainActors;
	private int noOfSideActors;
	private int noOfComedyActors;
	private int collection;
	private boolean horror;
	private boolean boring;

	public MovieDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", type=" + type + ", heroName=" + heroName + ", heroinenName=" + heroinenName
				+ ", directorName=" + directorName + ", ProducerName=" + ProducerName + ", budget=" + budget
				+ ", movieDuration=" + movieDuration + ", movieMakingDuration=" + movieMakingDuration
				+ ", noOfMainActors=" + noOfMainActors + ", noOfSideActors=" + noOfSideActors + ", noOfComedyActors="
				+ noOfComedyActors + ", collection=" + collection + ", horror=" + horror + ", boring=" + boring + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroinenName() {
		return heroinenName;
	}

	public void setHeroinenName(String heroinenName) {
		this.heroinenName = heroinenName;
	}

	public String isDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public boolean isProducerName() {
		return ProducerName;
	}

	public void setProducerName(boolean producerName) {
		ProducerName = producerName;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public double getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(double movieDuration) {
		this.movieDuration = movieDuration;
	}

	public int getMovieMakingDuration() {
		return movieMakingDuration;
	}

	public void setMovieMakingDuration(int movieMakingDuration) {
		this.movieMakingDuration = movieMakingDuration;
	}

	public int getNoOfMainActors() {
		return noOfMainActors;
	}

	public void setNoOfMainActors(int noOfMainActors) {
		this.noOfMainActors = noOfMainActors;
	}

	public int getNoOfSideActors() {
		return noOfSideActors;
	}

	public void setNoOfSideActors(int noOfSideActors) {
		this.noOfSideActors = noOfSideActors;
	}

	public int getNoOfComedyActors() {
		return noOfComedyActors;
	}

	public void setNoOfComedyActors(int noOfComedyActors) {
		this.noOfComedyActors = noOfComedyActors;
	}

	public int getCollection() {
		return collection;
	}

	public void setCollection(int collection) {
		this.collection = collection;
	}

	public boolean isHorror() {
		return horror;
	}

	public void setHorror(boolean horror) {
		this.horror = horror;
	}

	public boolean isBoring() {
		return boring;
	}

	public void setBoring(boolean boring) {
		this.boring = boring;
	}

}
