package Lesson2;

public class Task10 {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 1};
        shift(array, -2);
    }

    public static void shift(int[] array, int n) {
        int length = array.length;
        if (n > length || n < length * -1) {
            n = n % length;
        }
        if (n < 0) {
            n = length + n;
        }
        revert(array, 0, length - 1);
        revert(array, 0, n - 1);
        revert(array, n, length - 1);
    }

    public static void revert(int[] array, int from, int to) {
        for (int i = from, j = to; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
