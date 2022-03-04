package Lesson2;

public class Task2 {

    public static void main(String[] args) {
        checkPositiveOrNegative(3);
    }

    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число является отрицательным");
        }
    }
}
