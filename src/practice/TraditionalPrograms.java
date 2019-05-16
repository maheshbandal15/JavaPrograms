package practice;

public class TraditionalPrograms {

	public static void main(String[] args) {
		TraditionalPrograms obj =new TraditionalPrograms();
		obj.fibonacciSeries();
		System.out.println("\nFactorial of 5 is :"+ obj.factorial(5));
		obj.amstrongNumber(153);
		obj.palindromeNumber(1234321);
	}

	/**
	 * Armstrong Number in Java: A positive number is called armstrong number if it
	 * is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371,
	 * 407 etc.
	 */
	public void amstrongNumber(int n) {
		int a,sum=0,temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			sum+=(a*a*a);
		}
		if(temp==sum)
			System.out.println(temp +" is Amstrong number");
		else
			System.out.println(temp +" is NOT Amstrong number");
	}
	public int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}
	public int factorialOne(int num) {
		return (num == 0) ? 1 : num * factorial(num - 1);
	}
	public void fibonacciSeries() {
		int n1=0, n2=1,n3;
		int count=15;
		System.out.print("Fibonacci Series : "+n1+","+n2);
		for(int i=2;i<=count; i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
		//Fibonacci Series : 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610
	}
	public void palindromeNumber(int num1) {
		int temp=num1;
		int r,sum=0;
		while(num1>0) {
			r=num1%10;
			sum= (sum*10)+r;
			num1=num1/10;
		}
		if(temp==sum)
			System.out.println(temp+" Number is palindrome");
		else
			System.out.println(temp+" Not Palindrome" );
	}
}