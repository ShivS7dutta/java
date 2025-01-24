package collection;

import java.util.HashMap;
import java.util.Map;

public class MinimumOccuring {

	public static void main(String[] args) {
    String input = "greeksforgeeks";
        
        char minChar = getMinOccurringCharacter(input);
        System.out.println("Minimum occurring character: " + minChar);
    }

    public static char getMinOccurringCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the character with the minimum frequency
        char minChar = str.charAt(0);
        int minCount = frequencyMap.get(minChar);
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < minCount) {
                minChar = entry.getKey();
                minCount = entry.getValue();
            }
        }
        
        return minChar;
    

	}

}
/*
Frequency Map: We use a HashMap to store the frequency of each character.
Count Occurrences: The for loop goes through the string and updates the frequency of each character.
Find Minimum: We then loop through the HashMap to find the character with the lowest frequency.
*/
