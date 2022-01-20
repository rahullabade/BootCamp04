package company;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt();
		int r, sum = 0;
		int temp = number;
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println("the entered number " + temp + " is a palindrome");
		else
			System.out.println("the entered number " + temp + " is not a palindrome");
	}
}
