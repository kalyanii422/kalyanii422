package tasksCoreJava;

import java.util.Scanner;

public class PolindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = sc.nextInt();
		int sum = 0, r;
		int temp = number;
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println("Given number is a Palindrome number.");
		else
			System.out.println("Given number is Not a palindrome");

	}

}
