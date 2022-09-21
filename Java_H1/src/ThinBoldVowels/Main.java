package ThinBoldVowels;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char vowel;
		System.out.println("Please enter a vowel: ");
		vowel = input.next().charAt(0);
		
		if(vowel == 'A' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
			System.out.println("This vowel is bold.");
		}
		else if(vowel == 'a' || vowel == 'ı' || vowel == 'o' || vowel == 'u') {
			System.out.println("This vowel is bold");
		}
		else {
			System.out.println("This vowel is thin.");
		}
	}

}
