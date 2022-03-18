package by.andersenlab.trainee.lesson6;

public class ArrayUtils {

    private ArrayUtils() {
    }

    public static void checkLength(String[][] array) throws MyArraySizeException {
        if (array.length == 4 && array[0].length == 4) {
            System.out.println("Array is valid");
        } else {
            throw new MyArraySizeException("Size should be 4x4, actual size is: " + array.length + "x" + array[0].length);
        }
    }

    public static int convertAndSum(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Data is not correct in: " + i + "x" + j);
                }
            }
        }
        return sum;
    }
}

