package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array
		 Arrays.sort(arr);
		 
		 findDuplicate(arr);
	}
	static void findDuplicate(int arr[])
	{
		int l=arr.length,j=0;
		if(l==0 || l==1)
			{
			 System.out.println("No duplicates");
			 return;
			}
		int temp[]= new int[l];
		List<Integer> list= new ArrayList<Integer>();
		for(int i=0; i<l-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
			else
				list.add(arr[i]);
		}
		temp[j++]=arr[l-1];
		System.out.println("\nList of duplicates element is :");
		for(Integer i :list)
			System.out.print(i+" ");
		System.out.println("\nOriginal Array is :");
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println("\nremoved duplicate Array is :");
		for(int i : temp)
			System.out.print(i+" ");
	}

}
