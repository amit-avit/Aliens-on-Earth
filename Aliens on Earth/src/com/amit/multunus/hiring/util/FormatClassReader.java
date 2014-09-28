package com.amit.multunus.hiring.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Properties;



public class FormatClassReader {
	
	private static final String FORMAT_FILE_NAME = "format.properties";
	private static FormatClassReader _instance;
	
	private ArrayList<Entry<Object, Object>> formatArrayList;
	
	private FormatClassReader() {
	}
	
	public static FormatClassReader getInstance() throws Exception {
		if(_instance == null) {
			_instance = new FormatClassReader();
			Properties formatProperties = new Properties();
			formatProperties.load(new FileReader(FORMAT_FILE_NAME));
			_instance.formatArrayList = new ArrayList<>(formatProperties.entrySet());
		}
		return _instance;
	}
	
	public String read() throws IOException {
		displayOptions();
		String formatClass = readOption();
		return formatClass;
	}

	private void displayOptions() {
		System.out.println("Select format to save this Alien data: ");
		for (int i = 0; i < formatArrayList.size(); i++) {
			System.out.println((i+1) + " for " + formatArrayList.get(i).getKey());
		}
	}

	private String readOption() throws IOException {
		System.out.print("Enter option\t\t: ");
		String formatClass;
		String formatNumber = ConsoleReader.getInstance().readLine();
		try {
			int formatIndex = Integer.parseInt(formatNumber) - 1;
			formatClass = (String) formatArrayList.get(formatIndex).getValue();
		} catch (Exception e) {
			System.out.println("Invalid option. Please select a valid option from the above list.");
			return readOption();
		}
		return formatClass;
	}

}
