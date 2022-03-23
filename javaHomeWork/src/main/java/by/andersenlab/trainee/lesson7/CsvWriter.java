package by.andersenlab.trainee.lesson7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvWriter {

    public void save(AppData data) {
        try (PrintWriter writer = new PrintWriter("appData.csv")) {
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

            writer.write(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
