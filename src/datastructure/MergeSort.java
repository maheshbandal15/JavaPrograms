package datastructure;

public class MergeSort {

	public static void main(String[] args) {
		int a[]= {3,60,35,2,45,320,5};
		int low=0,high=a.length-1;
		for(int i:a)
			System.out.print(i+" ");
		mergesort(a,low,high);
		System.out.println("");
		for(int i:a)
			System.out.print(i+" ");
	}
	static void mergesort(int[] a, int low, int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;//mid=low+(high-low)/2;
			mergesort(a,low,mid);//left
			mergesort(a,mid+1,high);//right
			merge(a,low,mid,high); //merge sorted halves
		}
	}
	static void merge(int[] a, int low, int mid, int high)
	{
		int temp[]= new int[high+1];
		int k=low,i=low;
		int j=mid+1;
		while (i<=mid && j<=high)
		{
			if(a[i]<=a[j])
			{
				temp[k]=a[i];
				i++;
			}
			else
			{
				temp[k]=a[j];
				j++;
			}
			k++;
		}
		// Copy remaining of left side 
		while(i<=mid)
		{
			temp[k]=a[i];
			i++;
			k++;
		}
		// Copy remaining of right side
		while(j<=high)
		{
			temp[k]=a[j];
			j++;
			k++;
		}
		for(k=low;k<=high;k++)
		{
			a[k]=temp[k];//copy
		}
	}
}
