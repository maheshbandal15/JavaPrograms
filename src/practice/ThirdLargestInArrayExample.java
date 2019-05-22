package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
			int a[]={1,2,5,6,3,2};  
			int b[]={44,66,99,77,33,22,55};  
			System.out.println("Third Largest: "+getThirdLargest(a,6));  
			System.out.println("Third Largest: "+getThirdLargest(b,7));
//			Arrays.sort(a);
//			for (int x :a)
//			System.out.print(x+" ");
	}
	public static int getThirdLargest(int[] a, int total){  
		/*int temp;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-3];*/
		Arrays.sort(a);
		return(a[a.length-3]);
		}  
}
