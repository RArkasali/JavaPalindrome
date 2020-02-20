package Palindrome;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);   
        System.out.println("Give a value to check if it is a palindrome");  
        String input = in.nextLine();   
        
        if (new Palindrome().isPalindrome(input)) {
        	System.out.println("Yes it is a palindrome");
        }else {

        	System.out.println("No it is not a palindrome");
        }
    }
}
