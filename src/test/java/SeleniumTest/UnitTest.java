package SeleniumTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Palindrome.Palindrome;

public class UnitTest extends Palindrome {

	@Test
	public void PalindromePositiveTest() {
		Assert.assertTrue(isPalindrome("11011"));
		Assert.assertTrue(isPalindrome("ébcbe"));
	}
	
	@Test
	public void PalindromeNegativeTest() {
		Assert.assertFalse(isPalindrome("110111"));
		Assert.assertFalse(isPalindrome("suman"));
	}
	
	@Test
	public void PalindromeInvalidInputTest() {
		String NullValue = null;
		Assert.assertFalse(isPalindrome(NullValue));
		Assert.assertFalse(isPalindrome(""));
		Assert.assertFalse(isPalindrome("ab ba"));
		Assert.assertFalse(isPalindrome("!abba!"));
		Assert.assertFalse(isPalindrome("ab_ba"));
	}
}
