package com.amit.multunus.hiring;

import java.io.IOException;

import com.amit.multunus.hiring.entity.Alien;
import com.amit.multunus.hiring.format.FormatWriter;
import com.amit.multunus.hiring.format.FormatWriterFactory;
import com.amit.multunus.hiring.util.AlienReader;
import com.amit.multunus.hiring.util.ConsoleReader;
import com.amit.multunus.hiring.util.FormatClassReader;


public class DetailsEntryMain {
	
	public static void main(String[] args) {
		try {
			doDataEntry();
		} catch (Exception e) {
			System.err.println("------- Some exception occured. Closing application. -------");
		}
	}

	private static void doDataEntry() throws Exception {
		AlienReader alienReader = AlienReader.getInstance();
		FormatClassReader formatClassReader = FormatClassReader.getInstance();
		do {
			System.out.println("-------- Please enter the Alien details --------");
			Alien alien = alienReader.read();
			String formatWriterClass = formatClassReader.read();
			FormatWriter formatWriter = FormatWriterFactory.getFormatWriter(formatWriterClass);
			formatWriter.writeToFile(alien);
			System.out.println("________________________________________________");
			System.out.println("       Alien data written successfully");
			System.out.println("________________________________________________");
		} while (isNotEnd());
	}

	private static boolean isNotEnd() throws IOException {
		System.out.println("Input 'end' to end, else press enter to continue");
		System.out.print("\t\t  ");
		ConsoleReader consoleReader = ConsoleReader.getInstance();
		String string = consoleReader.readLine();
		return !string.equals("end");
	}

}
