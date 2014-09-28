package com.amit.multunus.hiring.util;

import java.io.IOException;

import com.amit.multunus.hiring.entity.Alien;


public class AlienReader {
	
	private static AlienReader _instance;
	
	private AlienReader() {
	}
	
	public static AlienReader getInstance() {
		if(_instance == null) {
			_instance = new AlienReader();
		}
		return _instance;
	}
	
	public Alien read() throws IOException {
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
