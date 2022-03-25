package tasksCoreJava;

import java.util.Scanner;

public class TrafficProgram {
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int value=0;
		if(isBirthday) {
			speed = speed-5;
			System.out.println("Today is your Birthday so Speed exemption for 5 KMPH ! new speed is : "+speed);
		} 
		else {
			System.out.println("Today is not your Birthday so Speed is :"+ speed);
		}
		if(speed <= 60) {
			value= 0;
		}else if (speed >= 61 && speed <= 80) {
			value= 1;
		}else if (speed >= 81) {
			value= 2; 
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		TrafficProgram tp = new TrafficProgram();	
		System.out.println("Please Enter the Speed : ");
		Scanner input = new Scanner(System.in);
		int speed = Integer.parseInt(input.nextLine());
		System.out.println("Enter your Birthday option is : true or false ");
		boolean isBirthday = Boolean.parseBoolean(input.nextLine());
		
		int ticketNumber = tp.caughtSpeeding(speed, isBirthday);
		System.out.println("Return value : "+ticketNumber);
		
		if(ticketNumber== 0) {
			System.out.println("No Tickets for this condition becuase speed is limited!!");
		}else if(ticketNumber == 1) {
			System.out.println("Small Ticket for speed crosed 60 KMPH");
		}else {
			System.out.println("Big Ticket for speed more than 80 KMPH");
		}
	}

}
