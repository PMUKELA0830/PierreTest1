package groupExercise3;

import java.util.Scanner;

public class groupExercise3 {

	public static void main(String[] args) {
		// Question1
		
		String word1 = "";
		countOccurencesOfA(word1);

	}
	
	public static void countOccurencesOfA(String word1) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the word which the number "
				+ "of occurences has to be found: ");
		word1 = input.next();
		char [] charArrWord1 = word1.toCharArray();
		String aCharacter = "a";
		char [] aChar = aCharacter.toCharArray();
		String upperCaseA = "A";
		char [] upperCaseAChar = upperCaseA.toCharArray();
		
		
		for (int i = 0; i < charArrWord1.length; i++) {
			if(charArrWord1[i] == aChar[0] || charArrWord1[i] == upperCaseAChar[0]) {
				count += 1;
			} else {
				count += 0;
			}
		}
		
		System.out.println("The number of occurences of the character A "
				+ "in the word " + word1 + " is " + count);
	}
	
}
