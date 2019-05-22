package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number :");
		int n=scan.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		while(n>0)
		{
			arr.add(n%2);
			n=n/2;
		}
		ListIterator<Integer> itr = arr.listIterator(arr.size());
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous());
		}
		scan.close();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n, count = 0, a;
//		String x = "";
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter any decimal number:");
//		n = s.nextInt();
//		while(n > 0)
//		{
//			a = n % 2;
//			if(a == 1)
//			{
//				count++;
//			}
//			x = x + "" + a;
//			n = n / 2;
//		}
//		String binary="";
//		for(int i=x.length()-1;i>=0;i--)
//		{
//			binary=binary+x.charAt(i);
//		}
//		System.out.println("Binary number:"+binary);
////		System.out.println("num :"+Integer.parseInt(x));
//		System.out.println("No. of 1s:"+count);
//	}
	
	

}
