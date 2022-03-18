package by.andersenlab.trainee.lesson6;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][5];

        String[][] symbolsArray = {
                {"1", "p", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] numbersArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println("Sum of numbers: " + ArrayUtils.convertAndSum(numbersArray));
            ArrayUtils.checkLength(array);
            ArrayUtils.convertAndSum(symbolsArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
