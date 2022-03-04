package Lesson2;

public class Task5 {

    public static void main(String[] args) {
        changeElements();
    }

    public static void changeElements() {
        int[] array = {0, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }
}
