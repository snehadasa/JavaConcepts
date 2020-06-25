package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
	public static void main(String[] args) {
		String str = "This is an awesome occasion. "
				+ "I love it";
		
		Map<Character, Integer> occurances = new HashMap<>();
		char[] chars = str.toCharArray();
		for (char character: chars) {
			Integer integer = occurances.get(character);
			occurances.get(character);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}
		System.out.println(occurances);

		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] strs = str.split(" ");
		for (String string: strs) {
			Integer integer = stringOccurances.get(string);
			occurances.get(string);
			if (integer == null) {
				stringOccurances.put(string, 1);
			} else {
				stringOccurances.put(string, integer + 1);
			}
		}
		System.out.println(stringOccurances);

	}

}
