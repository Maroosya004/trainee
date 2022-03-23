package by.andersenlab.trainee.lesson7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] header = { "Id", "Name", "Card Id" };
        int[][] data = {
                {100, 500, 700},
                {900, 760, 800}
        };
        AppData appData = new AppData(header, data);
        CsvWriter csv = new CsvWriter();
        csv.save(appData);

        CsvReader reader = new CsvReader();
        AppData appDataResult = reader.read();

        System.out.println(Arrays.toString(appDataResult.getHeader()));
        for (int[] values : appDataResult.getData()) {
            System.out.println(Arrays.toString(values));
        }
    }
}

