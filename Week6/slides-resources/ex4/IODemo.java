import java.io.*;
import java.util.*;

/**
  * This class demonstrates file input (i.e., reading) and output (i.e., writing)
  */
public class IODemo{

    /**
     * Proceed with the demo
     */
	public void showDemo() {
		String rankFile = "./data/rank.csv";

		// Read from file
		System.out.println ("Reading from: " + rankFile);
		ArrayList<String> entries = readEntriesFromFile(rankFile);
		printToScreen(entries);

		// Write to file
		String header = "Rank,XP,plot";
		String noviceEntry = "novice,0,5";
		String expertEntry = "expert,2000000,20";

		System.out.println ("\r\nWriting to: " + rankFile + " with append option");
		writeAnEntryToFile(rankFile, header, expertEntry, true);
		entries = readEntriesFromFile(rankFile);
		printToScreen(entries);

		System.out.println ("\r\nWriting to: " + rankFile + " with overwrite option");
		writeAnEntryToFile(rankFile, header, noviceEntry, false);
		entries = readEntriesFromFile(rankFile);
		printToScreen(entries);
	}

	/**
     * Read entries from a file
     * @param dataFile The location of the data file
	 * @return List of entries (i.e., all comma separated values except the header) read from the data file
     */
	private ArrayList<String> readEntriesFromFile(String dataFile) {
		// Task 1: Implement this method
        return null;
	}

	/**
     * Print a list of entries to the console
     * @param entries The list of entries (i.e., all comma separated values except the header) 
     */
	private void printToScreen(ArrayList<String> entries) {
		// Ignore the header i.e., i = 0,1 and 2
		// Print the content
		for(int i=3;i<entries.size();i= i+3) {

			String rank = entries.get(i);
			String experienceReqStr = entries.get(i+1);
			String plotOfLandManagedStr = entries.get(i+2);

			int experienceReq = Integer.parseInt(experienceReqStr);
			int plotOfLandManaged = Integer.parseInt(plotOfLandManagedStr);
			double expPerPlotOfLand = ((double)experienceReq)/plotOfLandManaged;

			// Print one entry
			System.out.println("\n** Entry: " + (i/3));
			System.out.println("Rank: " + rank);
			System.out.println("Experience required: " + experienceReq);
			System.out.println("Plot of land managed: " + plotOfLandManaged);
			System.out.println("Experience per plot of land: " + expPerPlotOfLand);
		}
	}


	/**
     * Write an entry to a file
     * @param dataFile The location of the data file
	 * @param header The header string of the data file
	 * @param entry String of values to be written as a line in the data file
	 * @param append Boolean variable that indicates if the way to write in the file
	 * will be by appending or overwriting the existing file.
     */
	private void writeAnEntryToFile(String dataFile, String header, String entry, boolean append) {
		// Task 2: Implement this method
	}
}