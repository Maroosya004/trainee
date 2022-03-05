package Lesson2;

public class Task7 {

    public static void main(String[] args) {
        changeElementsInArray();
    }

    public static void changeElementsInArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number < 6) {
                array[i] = number * 2;
            }
        }
    }
}
