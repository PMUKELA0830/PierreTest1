package groupExercise3;

import java.util.Scanner;

public class duplicateFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "";
		findDuplicates(string1);
		

	}

	public static void findDuplicates(String string1) {
		string1 = "";
		
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the string
		
		System.out.print("Please enter a word or any type of string: ");
		string1 = input.next();
		String duplicateFound = "";
		
		char [] charArr = string1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			int count = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					count++;
				}
			}
			if (count == 1) {
				duplicateFound = duplicateFound + "";
			} else {
				duplicateFound = duplicateFound + " " + charArr[i];
			}
		} System.out.println("The duplicates found in the word/string " + string1 + 
				" are: " + duplicateFound);
		
	}
}
