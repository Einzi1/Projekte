package de.einzinger.simon.musicChangesLogger;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File[] files = new File("H:/Testmusik").listFiles();
		FileReader fileReader = new FileReader();
		fileReader.printFiles(files);
	}

}
