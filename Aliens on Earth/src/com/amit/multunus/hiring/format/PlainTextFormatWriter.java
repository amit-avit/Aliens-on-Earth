package com.amit.multunus.hiring.format;

import java.io.FileWriter;
import java.io.IOException;

import com.amit.multunus.hiring.entity.Alien;

public class PlainTextFormatWriter implements FormatWriter {
	
	private static final String ALIEN_TXT_FILE_NAME = "alien.txt";
	private static PlainTextFormatWriter _instance;
	
	private PlainTextFormatWriter() {
	}
	
	public static PlainTextFormatWriter getInstance() {
		if(_instance == null) {
			_instance = new PlainTextFormatWriter();
		}
		return _instance;
	}

	@Override
	public void writeToFile(Alien alien) throws IOException {
		try (FileWriter writer = new FileWriter(ALIEN_TXT_FILE_NAME, true)) {
			writer.append(alien.toString());
			writer.append("\n");
		}
	}

}
