package PerfectNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Please enter a number: ");
		number = input.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<number ; i++) {
			if(number%i==0) {
				sum += i;
			}
		}
		
		if(sum == number) {
			System.out.println("The number is perfect.");
		}
		else {
			System.out.println("The number isn't perfect.");
		}
	}

}
