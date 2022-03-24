package by.andersenlab.trainee.lesson7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvWriter {

    private CsvWriter(){
    }

    public static void save(AppData data) {
        try (PrintWriter writer = new PrintWriter("AppData.csv")) {
            String csvString = appDataToCsvString(data);
            writer.write(csvString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String appDataToCsvString(AppData data) {
        StringBuilder builder = new StringBuilder();

        for (String columnName : data.getHeader()) {
            builder.append(columnName).append(";");
        }
        builder.deleteCharAt(builder.length() - 1);

        for (int[] rows : data.getData()) {
            builder.append("\n");
            for (int value : rows) {
                builder.append(value).append(";");
            }
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }
}
