package PrimeNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		boolean isPrime = true;
		
		System.out.println("Please enter a number: ");
		a = input.nextInt();
		
		for(int i = 2; i<a; i++) {
			if(a%i==0) {
				isPrime = false;
			}
		}
		if(isPrime == false) {
			System.out.println("The number isn't prime.");
		}
		else {
			System.out.println("The number is prime.");
		}
	}

}
