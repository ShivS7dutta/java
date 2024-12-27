package collection;

import java.util.HashMap;
import java.util.Map;

public class wordCountOccurance {

	public static void main(String[] args) {
String input = "My Name is my Name your";
        
// Convert the string to lowercase to make it case-insensitive
input = input.toLowerCase();
        
// Split the string into words based on spaces
String[] words = input.split("\\s+");

 // Create a HashMap to store word counts
Map<String, Integer> wordCountMap = new HashMap<>();

// Count occurrences of each word
for (String word : words) {
    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
}

// Print the word counts
for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
     System.out.println(entry.getKey() + ": " + entry.getValue());
   }
}

}
