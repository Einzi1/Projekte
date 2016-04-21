package de.einzinger.simon.musicChangesLogger;

import java.io.File;
import java.util.logging.LogManager;

public class Main {

	private static final String PATH = "H:/Testmusik";
	// private static final String PATH = "D:/Media/LogFiles";

	public static void main(String[] args) {
		System.setProperty("java.util.logging.config.file", "logging.properties");
		try {
			LogManager.getLogManager().readConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}

		File[] files = new File(PATH).listFiles();
		FileReader fileReader = new FileReader();
		fileReader.printFiles(files);
	}
}
