package company;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String initial, reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
		initial = input.nextLine();
		int length = initial.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + initial.charAt(i);
		System.out.println("Reversed String: " + reverse);
	}
}
