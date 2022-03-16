package by.andersenlab.trainee.lesson5;

public class ArrayUtils {

        private ArrayUtils() {
        }

        public static <T> void swap(T[] items, int first, int second) {
            var temp = items[first];
            items[first] = items[second];
            items[second] = temp;
        }

        public static <T> void print(T[] items) {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }

