package de.einzinger.simon.musicChangesLogger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileReader {

	private static final String DESTINATION_PATH = "H:/Testmusik/musikLog.log";
	// private static final String DESTINATION_PATH = "D:/Media/Musik";

	public void printFiles(File[] files) {
		for (File file : files) {
			if (file.isDirectory()) {
				printFiles(file.listFiles());
			} else {
				DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
				String today = formatter.format(new Date(System.currentTimeMillis()));
				String date = formatter.format(new Date(file.lastModified()));
				String output = date + " | " + file.getAbsolutePath();
				if (date.equals(today)) {
					System.out.println(output);
					log(output);
				}
			}
		}
	}

	private void log(String output) {
		Logger logger = Logger.getLogger(this.getClass().getName());
		Handler handler = null;
		try {
			handler = new FileHandler(DESTINATION_PATH, true);
			Formatter formatter = new SimpleFormatter();
			handler.setFormatter(formatter);
			logger.addHandler(handler);
		} catch (SecurityException | IOException e) {

		}

		logger.setLevel(Level.INFO);
		logger.info(output);
		handler.close();
	}
}
