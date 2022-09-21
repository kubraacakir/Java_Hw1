package FriendNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int number1 = input1.nextInt();
		System.out.println("Please enter second number: ");
		int number2 = input2.nextInt();
		
		int sum1=0,sum2=0;
		
		for(int i = 1; i<number1 ; i++) {
			if(number1 % i == 0) {
				sum1 += i;
			}
		}
		
		for(int j = 1 ; j<number2 ; j++) {
			if(number2 % j == 0) {
				sum2 += j;
			}
		}
		
		if(sum1 == number2 && sum2 == number1) {
			System.out.println("These numbers are friends.");
		}
		
		else {
			System.out.println("These numbers aren't friends.");
		}
	}

}
