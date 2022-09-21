package FindNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number to search: ");
		int number = input.nextInt();
		
		boolean find = false;
		
		int array[] = new int[] {1,4,7,2,3,9};
		for(int num : array) {
			if(num == number) {
				find = true;
			}
		}
		
		if(find == true) {
			System.out.println("The number is in the array.");
		}
		else {
			System.out.println("The number isn't in the array.");
		}

	}

}
