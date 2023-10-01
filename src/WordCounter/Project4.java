package WordCounter;

import java.util.HashMap;
import java.util.Map;

public class Project4 {

    public static Map<String, Integer> countWords(String text) {
        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a map to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            word = word.toLowerCase();  // Convert to lowercase to ignore case
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }

    public static void main(String[] args) {
        String text = "This is a sample text. This text will be used to demonstrate word counting.";
        System.out.println("Input text:\n" + text);

        // Count the words
        Map<String, Integer> wordCounts = countWords(text);

        // Display the word counts
        System.out.println("\nWord counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
