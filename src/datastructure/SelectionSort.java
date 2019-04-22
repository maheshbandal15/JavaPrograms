package datastructure;


public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,60,35,2,45,320,5};
		for(int i:a)
			System.out.print(i+" ");
		selectionSort(a);
//		selectionSortOther(a);
		System.out.println("");
		for(int i:a)
			System.out.print(i+" ");
		
	}
	static void selectionSort(int[] a)
	{
		int k;
		for(int i=0;i<a.length-1;i++)
		{
			k=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[k])
					k=j;	
			}
			if(i!=k)
			{
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
			System.out.println("\nafter "+(i+1)+" th pass");
			for(int x:a)
				System.out.print(x+" ");
		}
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
			System.out.println("\nafter "+(i+1)+" th pass");
			for(int x:a)
				System.out.print(x+" ");
		}
	}
}
