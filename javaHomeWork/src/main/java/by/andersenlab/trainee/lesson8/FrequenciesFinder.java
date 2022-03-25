package by.andersenlab.trainee.lesson8;

import java.util.*;

public class FrequenciesFinder {

    private FrequenciesFinder() {
    }

    public static Map<String, Integer> countFrequencies(String[] strings) {
        Map<String, Integer> uniqueWordsWithOccurrencesNumber = new HashMap<>();
        for (String word : strings) {
            if (uniqueWordsWithOccurrencesNumber.containsKey(word)) {
                int occurrencesNumber = uniqueWordsWithOccurrencesNumber.get(word);
                occurrencesNumber++;
                uniqueWordsWithOccurrencesNumber.put(word, occurrencesNumber);
            } else {
                uniqueWordsWithOccurrencesNumber.put(word, 1);
            }
        }
        return uniqueWordsWithOccurrencesNumber;
    }
}