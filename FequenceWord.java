import java.util.HashMap;

public class FequenceWord {
    public static void main(String[] args) {
        // The input string
        String input = "The quick the brown fox jumps over the lazy dog.";

        // Convert the input string to lower case
        input = input.toLowerCase();

        // Split the input string into an array of words
        String[] words = input.split(" ");

        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> frequency = new HashMap<>();

        // Loop through the array of words and count the frequency of each word
        for (String word : words) {
            if (frequency.containsKey(word)) {
                // If the word is already in the HashMap, increment the count
                frequency.put(word, frequency.get(word) + 1);
            } else {
                // If the word is not in the HashMap, add it with a count of 1
                frequency.put(word, 1);
            }
        }

        // Print the frequency of each word
        for (String word : frequency.keySet()) {
            System.out.println(word + ": " + frequency.get(word));
        }
    }
}