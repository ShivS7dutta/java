package String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

	public static void main(String[] args) {
		String csvFile = "path/to/yourfile.csv";
        String line;
        String csvDelimiter = ","; // Delimiter used in the CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Split each line by the delimiter and store in an array
                String[] values = line.split(csvDelimiter);

                // Print each value
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println(); // Move to the next line after printing all values
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
