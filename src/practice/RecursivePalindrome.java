package practice;

public class RecursivePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursivePalindrome obj = new RecursivePalindrome();
		String str ="malayalam";
		if(obj.isPalindrome(str))
			System.out.println("Yes");
		else
			System.out.println("No");
		int x = 123454321;
		if(obj.isPalindrome(x))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public boolean isPalindrome(String str) {
		int size = str.length();
		if(size==0)
			return true;
		return checkPalindrome(str,0,size-1);
	}
	public boolean isPalindrome(int num) {
		int temp = reverse(num,0);
		return (num==temp)? true :false;
	}

	private int reverse(int num, int temp) {
		if(num == 0)
			return temp;
		temp = temp*10+ num%10;
		return reverse(num/10,temp);
	}

	private boolean checkPalindrome(String str, int start, int end) {
		if(start==end)
			return true;
		if(str.charAt(start)!= str.charAt(end))
			return false;
		// If there are more than two characters, check if 
		// middle substring is also palindrome or not. 
		if(start < end+1)
			return checkPalindrome(str, start+1, end-1);
		return true;
	}

}
