package practice;

/**
 * @author MAHESH BANDAL
 * 21-May-2019
 * TODO Write a program that prompts the user to enter a credit card number as a long integer and Display whether that card is valid or invalid.
 * Credit card numbers follow certain patterns.
 * A credit card number must have between 13 and 16 digits. It must start with:
 * 		4 for Visa cards
 * 		5 for Master cards
 * 		37 for American Express cards
 * 		6 for Discover cards
 */
public class CreditCardNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long number = 4388576018402626L; //invalid
		long number = 379354508162306L; //Valid
		
		CreditCardNumberValidation obj = new CreditCardNumberValidation();
		if(obj.validateCardNo(number)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
	public boolean validateCardNo(long n) {
		return (getSize(n) >=13 && getSize(n) <=16
				&& (checkPrefix(n, 4) ||
					checkPrefix(n, 5) ||
					checkPrefix(n, 37)||
					checkPrefix(n, 6))
				&& ((sumOfSquareOfEvenPlaces(n)+ sumOfOddPlaces(n)) %10==0)
				);
	}
	
	private int sumOfSquareOfEvenPlaces(long num) {
		String s = num+"";
		int sum=0;
		for(int i = s.length()-2; i>=0; i-=2) {
			sum += getDigit(Integer.parseInt(s.charAt(i)+"")*2);
		}
		return sum;
	}
	private int sumOfOddPlaces(long num) {
		String s = num+"";
		int sum=0;
		for(int i = s.length()-1; i>=0; i-=2) {
			sum += getDigit(Integer.parseInt(s.charAt(i)+""));
		}
		return sum;
	}
	private int getDigit(int x) {
		if(x<10)
			return x;
		return x/10 + x%10;
	}
	
	private boolean checkPrefix(long num , int d) {
		return getPrefix(num, getSize(d)) == d;
	}
	
	private long getPrefix(long num , int k) {
		if(getSize(num)>k) {
			String s = num+"";
			return Long.parseLong(s.substring(0,k));
		}
		return num;
	}
	private int getSize(long l) {
		String s = l+"";
		return s.length();
	}
}
