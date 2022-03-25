package by.andersenlab.trainee.lesson8;

import java.util.*;

public class PhoneBook {

    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            List<String> phoneNumbers = phoneBook.get(lastName);
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        } else {
            phoneBook.put(lastName, new ArrayList<>(Arrays.asList(phoneNumber)));
        }
    }

    public List<String> get(String lastName) throws PersonNotFoundException {
        if (phoneBook.containsKey(lastName)) {
            return phoneBook.get(lastName);
        } else {
            throw new PersonNotFoundException("Person " + lastName + " not found in the phone book");
        }
    }

    public void printNumber(String name) {
        List<String> numbers = get(name);
        System.out.print("Last name: " + name + "(");
        for (String number : numbers) {
            System.out.print(number + ";");
        }
        System.out.println(")");
    }
}
