package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		for(int i=0;i<101;i++) {
			if(primeNumber.isPrime(i))
				System.out.print(i+",");
		}
	}
	
	private boolean isPrime(int num) {
		if(num<2)
			return false;
		
		for(int i=2; i<=num/2;i++) {
			if(num%i ==0)
				return false;
		}		
		return true;
	}

}
