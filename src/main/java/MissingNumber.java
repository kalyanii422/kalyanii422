package tasksCoreJava;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter the total number of elements ");
		n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the elements of the array ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = (n) * (n+1) / 2;
		for (int i = 0; i < n; i++) {
			sum = sum - arr[i];
		}
		System.out.println("Missing Element is " + sum);

	}

}
