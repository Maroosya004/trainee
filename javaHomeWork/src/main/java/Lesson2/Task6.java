package Lesson2;

public class Task6 {

    public static void main(String[] args) {
        fillInArray();
    }

    public static void fillInArray() {
        int[] emptyArray = new int[100];
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i + 1;
        }
    }
}
