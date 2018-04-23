package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileManager {

	private static final File REPORT = new File("record.txt");
	
	public void writeReport(int time, String report) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter(REPORT);
		printWriter.print("Tiempo total: " + time);
		printWriter.println(report);
		printWriter.close();
	}
}