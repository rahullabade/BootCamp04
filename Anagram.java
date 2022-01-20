package company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String");
		String string1 = scanner.nextLine();
		System.out.println("Enter the Scend String");
		String string2 = scanner.nextLine();

		if (checkAnagram(string1, string2)) {
			System.out.println(string1 + "and" + string2 + "are Anagram");
		} else {
			System.out.println(string1 + "and" + string2 + "are Not Anagram");
		}
	}

	private static boolean checkAnagram(String string1, String string2) {
		string1 = string1.replaceAll("\\s", "");
		string2 = string2.replaceAll("\\s", "");

		// Check if both length matches
		if (string1.length() != string2.length())
			return false;
		else {
			// Convert both Strings into lower case and into Character Array
			char[] array1 = string1.toLowerCase().toCharArray();
			char[] array2 = string2.toLowerCase().toCharArray();

			// Sort both Character Array
			Arrays.sort(array1);
			Arrays.sort(array2);

			// Check if both arrays are equal
			return (Arrays.equals(array1, array2));
		}
	}
}
