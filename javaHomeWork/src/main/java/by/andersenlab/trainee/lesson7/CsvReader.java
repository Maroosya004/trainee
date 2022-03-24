package by.andersenlab.trainee.lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private CsvReader() {
    }

    public static AppData read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("AppData.csv"))) {
            return csvFileReaderToAppData(reader);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static AppData csvFileReaderToAppData(BufferedReader reader) throws IOException {
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

        int[][] data = stringsToInts(dataStrings);
        return new AppData(header, data);
    }

    private static int[][] stringsToInts(List<String[]> strings) {
        int[][] ints = new int[strings.size()][];
        for (int i = 0; i < strings.size(); i++) {
            String[] stringsRow = strings.get(i);
            int[] intsRow = new int[stringsRow.length];

            for (int j = 0; j < stringsRow.length; j++) {
                intsRow[j] = Integer.parseInt(stringsRow[j]);
            }
            ints[i] = intsRow;
        }
        return ints;
    }
}

