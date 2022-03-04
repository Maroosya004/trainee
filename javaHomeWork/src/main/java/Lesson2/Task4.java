package Lesson2;

public class Task4 {

    public static void main(String[] args) {
        printString("Hello", 15);
        System.out.println(checkLeapYear(400));
    }

    public static void printString(String string, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(string);
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }
}
