package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {

	public static List<String> groupAnagrams(String[] words) {
        // Create a HashMap to store the sorted word as key and list of anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate through each word in the input list
          for (String word : words) {
            // Convert the word to a character array, sort it and convert back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray); // Sorted word as key

            // Group words by their sorted key
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }

        // Prepare a list to hold one word from each anagram group
        List<String> result = new ArrayList<>();

        // Iterate over the map and pick the first word from each group
        for (List<String> anagramList : anagramMap.values()) {
            // Add the first word from each anagram group
            result.add(anagramList.get(0));
        }

        return result;
    }

    public static void main(String[] args) {
        // Input array of words
        String[] words = {"ate", "bat", "eat", "tab", "now", "won"};

        // Get the result from the groupAnagrams function
        List<String> anagramWords = groupAnagrams(words);

        // Print each word from the result on a new line
        for (String word : anagramWords) {
            System.out.println(word);
           
            /*
Sorting:
We convert each word to a character array, sort it, 
and then convert it back to a string (sortedWord). 
This sorted version of the word serves as the key in 
the HashMap where words that are anagrams will have the same key.

HashMap for Grouping: 
We use a HashMap<String, List<String>> where the key 
is the sorted word and the value is a list of 
words (anagrams) that have the same sorted form.

Storing and Grouping:

If the sorted word is not already in the map, we use 
putIfAbsent to initialize a new list.
We then add the word to the list associated with the sorted word in the map.
Output:
After grouping the words, we iterate through the values 
of the HashMap (which are lists of anagrams) 
and add the first word from each list to the result.
             */
            
        }
    }

}
