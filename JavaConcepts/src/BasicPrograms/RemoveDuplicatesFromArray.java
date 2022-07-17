package BasicPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 5, 3, 3, 4, 5 };
		int length = arr.length;
		Arrays.sort(arr);
		length = removeDuplicates(arr, length);
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

		// array sort
		int arr1[] = { 2, 2, 5, 3, 3, 4, 5 };
		arraySort(arr1);
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		// String sorting
		System.out.println(stringArraySort("Mani"));
	}

	// Remove Duplicates
	public static int removeDuplicates(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;

	}

	// array sort
	public static void arraySort(int arr[]) {

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// String array sort
	public static String stringArraySort(String s) {
		char temp;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) > s.charAt(j)) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		s = String.copyValueOf(ch);
		return s;

	}

}
