package collection;

import java.util.HashMap;
import java.util.Map;

public class CountOccrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str = "hello world 1232";
        
        // Get the frequency of each character
        Map<Character, Integer> frequencyMap = countCharacterOccurrences(str);
        
        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
        }
    }

    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        // Create a map to store character counts
        Map<Character, Integer> map = new HashMap<>();
        
        // Convert the string to a character array
        for (char c : str.toCharArray()) {
            // Update the map with the count of each character
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        return map;
	}

}
