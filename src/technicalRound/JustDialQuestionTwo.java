package technicalRound;

import java.util.Arrays;

/**
 * @author MAHESH BANDAL
 *	Given a string s. find out if at can form palindrome.
 *	print Yes or No
 * eg.	 input : abcd
 * 		output : No
 * 		
 * 		 input : abcddcba
 * 		output : Yes
 * 
 * 		 input : aaccbbd
 * 		output : Yes
 */
public class JustDialQuestionTwo {

	static int NO_OF_CHARS = 256;
	/**
	 * 
	 */
	static boolean canFormPalindrome(String str) {  
		// Create a count array and initialize all values as 0
		int count[] = new int[NO_OF_CHARS];
		Arrays.fill(count, 0);

		// For each character in input strings, increment count in the corresponding count array
		for (int i = 0; i < str.length(); i++)
			count[(int) (str.charAt(i))]++;
		
		// Count odd occurring characters
		int odd = 0;
		for (int i = 0; i < NO_OF_CHARS; i++) {
			if ((count[i] & 1) == 1)
				odd++;
			
			if (odd > 1)
				return false;
		}
		// Return true if odd count is 0 or 1,
		return true;
	}

	public static void main(String[] args) {
		if (canFormPalindrome("abcd"))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (canFormPalindrome("abcddcba"))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		if (canFormPalindrome("aaccbbd"))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
	
	/**
	 * Time Complexity is O(n)
	 */
	static boolean canFormPalindromeAnother(String str) { 
		  
        // Create a list 
        java.util.List<Character> list = new java.util.ArrayList<Character>(); 
  
        // For each character in input strings, 
        // remove character if list contains 
        // else add character to list 
        for (int i = 0; i < str.length(); i++) { 
            if (list.contains(str.charAt(i))) 
                list.remove((Character) str.charAt(i)); 
            else
                list.add(str.charAt(i)); 
        } 
  
        // if character length is even list is expected to empty 
        // or if character length is off list size is expected to be 1 
        if (str.length() % 2 == 0 && list.isEmpty() // if string length is even 
                || (str.length() % 2 == 1 && list.size() == 1)) // if string length is odd 
            return true; 
        else
            return false; 
  
    } 
}
