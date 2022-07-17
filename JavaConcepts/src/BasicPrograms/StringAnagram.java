package BasicPrograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		anagram("Army", "marry");
	}

	public static void anagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char ch1[] = s1.toLowerCase().toCharArray();
			char ch2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String s = String.valueOf(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Given strings are anagram");
			} else {
				System.out.println("Given strings are not anagram");
			}
		} else {
			System.out.println("Given strings are not anagram");
		}

	}
}
