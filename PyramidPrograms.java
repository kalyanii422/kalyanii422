package tasksCoreJava;

import java.util.Scanner;

public class PyramidPrograms {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for numner of lines :");
		
		int numberLines = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the value for pattern :");
		
		int numberPattern = Integer.parseInt(input.nextLine());
		
		int count =0;
		for(int i = 0; i < numberLines ; i++) {
			
			for(int j = 0; j <= i ; j++) {
				System.out.print(count+" ");
				count=count+numberPattern;
			}
			System.out.println();
		}
	}

}
