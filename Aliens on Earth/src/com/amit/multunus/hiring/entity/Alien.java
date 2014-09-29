package com.amit.multunus.hiring.entity;

import java.io.IOException;

import com.amit.multunus.hiring.util.ConsoleReader;

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
	
	@Override
	public String toString() {
		return codeName + "\t" + bloodColor + "\t" + noOfAntennas + "\t" + noOfLegs + "\t" + homePlanet;
	}
	
	public static Alien readAlien() throws IOException {
		ConsoleReader reader = ConsoleReader.getInstance();
		System.out.println();
		System.out.print("Code Name\t\t: ");
		String codeName = reader.readLine();
		System.out.print("Blood Color\t\t: ");
		String bloodColor = reader.readLine();
		System.out.print("Number of Antennas\t: ");
		String noOfAntennas = reader.readLine();
		System.out.print("Number of Legs\t\t: ");
		String noOfLegs = reader.readLine();
		System.out.print("Home Planet\t\t: ");
		String homePlanet = reader.readLine();
		System.out.println();
		
		Alien alien = new Alien(codeName, bloodColor, noOfAntennas, noOfLegs, homePlanet);
		return alien;
	}

}
