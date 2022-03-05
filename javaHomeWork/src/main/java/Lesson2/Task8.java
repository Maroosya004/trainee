package Lesson2;

public class Task8 {

    public static void main(String[] args) {
        drawDiagonal();
    }

    public static void drawDiagonal() {
        int[][] array = new int[5][5];
        int length = array.length - 1;
        for (int i = 0; i <= length; i++) {
            array[i][i] = 1;
            array[i][length - i] = 1;
        }
    }
}
