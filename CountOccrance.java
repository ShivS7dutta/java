package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccrance {

	public static void main(String[] args) {

		String str = "hello world 1232";
		Scanner scanner = new Scanner(System.in);
		//  System.out.print("Enter a string: ");
		//  String input = scanner.nextLine();
		String input="shivnath3453";

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("Character occurrences:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		scanner.close();

	}}
