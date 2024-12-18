package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	public static int[] removeDuplicates(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the array to the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] newArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArr[index++] = num;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 5, 3};

        // Removing duplicates
        arr = removeDuplicates(arr);

        // Printing the updated array
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
    }
}
