package OOPs.Module3.Part4.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TemperatureAverage {
    private static final String CSV_FILE_PATH = "C:\\Users\\sidda\\Downloads\\temploki.csv";
    private static final String DATE_FORMAT = "dd.MM.yyyy HH:mm";
    private static final String TARGET_DATE = "01.01.2023";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH));

            // Read the header to identify the column indices
            String header = reader.readLine();
            String[] columns = header.split(";");
            int ulkoTaloIndex = -1;

            for (int i = 0; i < columns.length; i++) {
                if (columns[i].trim().equalsIgnoreCase("UlkoTalo")) {
                    ulkoTaloIndex = i;
                    break;
                }
            }

            if (ulkoTaloIndex == -1) {
                System.out.println("Column 'UlkoTalo' not found in the CSV file.");
                return;
            }

            // Calculate the average temperature for the 1st day of January 2023
            String line;
            double sum = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                String timestampStr = values[0].trim();

                // Parse timestamp and check if it's on the target date
                Date timestamp = new SimpleDateFormat(DATE_FORMAT).parse(timestampStr);
                if (isTargetDate(timestamp)) {
                    // Parse temperature value
                    String ulkoTaloStr = values[ulkoTaloIndex].trim().replace(",", ".");
                    double ulkoTaloTemp = Double.parseDouble(ulkoTaloStr);

                    sum += ulkoTaloTemp;
                    count++;
                }
            }

            reader.close();

            // Calculate and print the average temperature
            if (count > 0) {
                double averageTemperature = sum / count;
                System.out.println("Average temperature on " + TARGET_DATE + ": " + averageTemperature);
            } else {
                System.out.println("No temperature measurements found for the target date.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static boolean isTargetDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDate = dateFormat.format(date);
        return formattedDate.equals(TARGET_DATE);
    }
}

