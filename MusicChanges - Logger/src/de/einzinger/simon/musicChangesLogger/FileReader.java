package de.einzinger.simon.musicChangesLogger;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileReader {

	public void printFiles(File[] files) {
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("Verzeichnisname: " + file.getName());
				printFiles(file.listFiles());
				System.out.println("_______________________________________");
			} else {
				DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
				String today = formatter.format(new Date(System.currentTimeMillis()));
				String date = formatter.format(new Date(file.lastModified()));
				String output = date + " | " + file.getName();
				if (date.equals(today)) {
					System.out.println(output);
				}
			}
		}
	}
}
