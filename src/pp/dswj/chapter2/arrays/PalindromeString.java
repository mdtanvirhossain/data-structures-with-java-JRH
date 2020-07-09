package pp.dswj.chapter2.arrays;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String original, reverse = "";
		
		original = in.nextLine();
		for (int i = original.length()-1; i >=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Original: "+original);
		System.out.println("Reverse: "+reverse);
		
		if (original.equals(reverse)) {
	         System.out.println("Entered string/number is a palindrome."); 
		}
	    else  {
	         System.out.println("Entered string/number isn't a palindrome.");  
	    }
	}

}
