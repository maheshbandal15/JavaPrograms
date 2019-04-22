package datastructure;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {3,60,35,2,65,45,320,5,-1};
//		selectionSortOther(a);
		Arrays.sort(a);
		int low=0,high=a.length-1;
		int value=3220;
		int index= binarySearch(a, value,low,high);
		if(index== -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+index);
	}
	static int binarySearch(int[] a,int value, int low, int high)
	{
		if(low<=high)
		{
			int mid=(low+high)/2; //low+(high-low)/2;  
			if(value==a[mid])
			{
				return mid;
			}
			else if(value<a[mid])
			{
				return binarySearch(a, value,low,mid-1);
			}
			else
				return binarySearch(a, value,mid+1,high);
			
		}
		
		return -1;
	}
	static void selectionSortOther(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
//			System.out.println("\nafter "+(i+1)+" th pass");
//			for(int x:a)
//				System.out.print(x+" ");
		}
	}
}
