package datastructure;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,60,35,2,45,320,5};
		for(int i:a)
			System.out.print(i+" ");
		insertionSort(a);
		System.out.println("");
		for(int i:a)
			System.out.print(i+" ");
	}
	static void insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			System.out.println("\nafter "+i+" th pass");
			for(int x:a)
				System.out.print(x+" ");
		}
	}

}
