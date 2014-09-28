package com.amit.multunus.hiring.entity;

public class Alien {
	
	private String codeName;
	private String bloodColor;
	private String noOfAntennas;
	private String noOfLegs;
	private String homePlanet;
	
	public Alien(String codeName, String bloodColor, String noOfAntennas,
			String noOfLegs, String homePlanet) {
		super();
		this.codeName = codeName;
		this.bloodColor = bloodColor;
		this.noOfAntennas = noOfAntennas;
		this.noOfLegs = noOfLegs;
		this.homePlanet = homePlanet;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getBloodColor() {
		return bloodColor;
	}

	public void setBloodColor(String bloodColor) {
		this.bloodColor = bloodColor;
	}

	public String getNoOfAntennas() {
		return noOfAntennas;
	}

	public void setNoOfAntennas(String noOfAntennas) {
		this.noOfAntennas = noOfAntennas;
	}

	public String getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(String noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getHomePlanet() {
		return homePlanet;
	}

	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}
	
	@Override
	public String toString() {
		return codeName + "\t" + bloodColor + "\t" + noOfAntennas + "\t" + noOfLegs + "\t" + homePlanet;
	}

}
