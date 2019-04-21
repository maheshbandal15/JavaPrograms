package practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num1=1234321;
		int temp=num1;
		int r,sum=0;
		while(num1>0) {
			r=num1%10;
			sum= (sum*10)+r;
			num1=num1/10;
		}
		if(temp==sum)
			System.out.println("Number is palindrome :"+temp);
		else
			System.out.println("Not Palindrome");
	}

}
