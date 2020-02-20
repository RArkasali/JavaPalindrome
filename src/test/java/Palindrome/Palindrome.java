package Palindrome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

	public boolean isPalindrome(String originalInput) {
		String reverseInput = "";
		String regex = "[a-z0-9]*";
		if (originalInput == null) {
			System.out.println("Input value is null");
			return false;
		}
		if (originalInput.isEmpty()) {
			System.out.println("Input value is Empty");
			return false;
		}
		if (originalInput.contains(" ")) {
			System.out.println("Input value contains spaces");
			return false;
		}
		originalInput = originalInput.replace('é', 'e').toLowerCase();
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(originalInput);  
		boolean regexBool= m.matches();
		if (!regexBool) {
			System.out.println("It should contain alphabets and numerical values only");
			return false;
		}
		for (int i = originalInput.length()-1; i>=0; i--) {
			reverseInput = reverseInput + originalInput.charAt(i);
		}
		
		if (originalInput.equals(reverseInput)) {
			System.out.println("It is a Palindrome value");
			return true;
		}else {
			System.out.println("It is not a Palindrome value");
			return false;
		}
	}
}
