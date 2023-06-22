import java.util.HashMap;

public class UniqueWordsFinderMap {
    public static void main(String[] args) {
        String text = "This is a Sample text. It contains several Words, some words 'This' of which may repeat. The words 'sample' and 'text' should appear only once.";

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Splitting a string into words using spaces and punctuation
        String[] words = text.split("[\\s.,;?!']+");

        // Counting of words frequency
        for (String word : words) {


            // Checking that word already exist in HashMap
            if (wordFrequency.containsKey(word)) {
                int frequency = wordFrequency.get(word);
                wordFrequency.put(word, frequency + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

        // Output unique words and their frequency
        System.out.println("Unique words and their frequency:");
        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}