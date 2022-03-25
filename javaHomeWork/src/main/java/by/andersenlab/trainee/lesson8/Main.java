package by.andersenlab.trainee.lesson8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Masha", "Dasha", "Dmitriy", "Ivan", "Karina", "Masha", "Dasha", "Polina", "Sasha", "Katya"};
        Map<String, Integer> uniqueNamesWithOccurrencesNumber = FrequenciesFinder.countFrequencies(names);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+123456");
        phoneBook.add("Petrov", "+109876");
        phoneBook.add("Ivanov", "+387309");
        phoneBook.add("Vasnetsov", "+9078524");

        phoneBook.printNumber("Ivanov");
        phoneBook.printNumber("Petrov");
        phoneBook.printNumber("Vasnetsov");
    }
}
