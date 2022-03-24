package by.andersenlab.trainee.lesson7;

public class Main {

    public static void main(String[] args) {
        String[] header = { "Id", "Name", "Card Id" };
        int[][] data = {
                {100, 500, 700},
                {900, 760, 800}
        };
        AppData appData = new AppData(header, data);

        CsvWriter.save(appData);
        AppData appDataResult = CsvReader.read();
    }
}

