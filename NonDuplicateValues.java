package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonDuplicateValues {

	public static List<Integer> findNonDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Count the occurrences of each element in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Collect elements that appear exactly once
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> nonDuplicates = findNonDuplicates(arr);
        
        System.out.println(nonDuplicates);
    }
}
