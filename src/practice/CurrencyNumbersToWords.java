package practice;

public class CurrencyNumbersToWords {

	public static void main(String[] args) {
		int cur= 1015510231;
		CurrencyNumbersToWords obj = new CurrencyNumbersToWords();
		obj.currency(cur);		
	}
	
	public void currency(int cur) {
		toWords((cur/1000000000)%100, "Hundred");
		toWords((cur/10000000)%100, "Crore");    
		toWords((cur/100000)%100, "Lakh");       
		toWords((cur/1000)%100, "Thousand");     
		toWords((cur/100)%10, "Hundred");        
		toWords(cur%100, " ");                   
	}
	
	public void toWords(int n,String str) {
		String[] one= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
				"Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] ten= {" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if(n>19) {
			System.out.print(ten[n/10] /*+" "*/+ one[n%10] +" ");
		} else {
			System.out.print(one[n]+" ");
		}
		if(n>0) {
			System.out.print(str+" ");
		}
	}

}
