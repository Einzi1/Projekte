package de.einzinger.simon.musicChangesLogger;

import java.io.File;

public class Main {

	private static final String PATH = "H:/Testmusik";

	public static void main(String[] args) {
		File[] files = new File(PATH).listFiles();
		FileReader fileReader = new FileReader();
		fileReader.printFiles(files);
	}
}
