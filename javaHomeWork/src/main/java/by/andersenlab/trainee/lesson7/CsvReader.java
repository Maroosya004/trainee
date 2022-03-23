package by.andersenlab.trainee.lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public AppData read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("appData.csv"))) {
            String[] header;
            String line;
            if ((line = reader.readLine()) != null) {
                header = line.split(";");
            } else {
                return null;
            }

            List<String[]> dataStrings = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                dataStrings.add(line.split(";"));
            }

            int[][] data = new int[dataStrings.size()][];
            for (int i = 0; i < dataStrings.size(); i++) {
                String[] stringsRow = dataStrings.get(i);
                int[] row = new int[stringsRow.length];

                for (int j = 0; j < stringsRow.length; j++) {
                    row[j] = Integer.parseInt(stringsRow[j]);
                }

                data[i] = row;
            }

            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

