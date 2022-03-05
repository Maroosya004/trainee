package Lesson2;

public class Task9 {

    public static void main(String[] args) {
        createWithInitialValue(100, 2);
    }

    public static int[] createWithInitialValue(int len, int initialValue) {
         int[] array = new int[len];
         for (int i = 0; i < len; i++) {
             array[i] = initialValue;
         }
         return array;
    }
}
