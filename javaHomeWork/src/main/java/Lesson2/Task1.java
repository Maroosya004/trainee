package Lesson2;

public class Task1 {

    public static void main(String[] args) {
        checkNumbers(15, 13);
    }

    public static boolean checkNumbers(int firstNumber, int secondNumber) {
        int sumNumbers = firstNumber + secondNumber;
        return sumNumbers > 10 && sumNumbers <= 20;
    }
}
