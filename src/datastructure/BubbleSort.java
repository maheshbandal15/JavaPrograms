package datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,60,35,2,45,320,5};
//		int a[]= {320,60,45,35,5,3,2};
		for(int i:a)
			System.out.print(i+" ");
		bubblesort(a);
		System.out.println("\nSorted array: ");
		for(int i:a)
			System.out.print(i+" ");
			
	}
	static void bubblesort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println("\nafter "+(i+1)+" th pass");
			for(int x:a)
				System.out.print(x+" ");
		}
	}
	/*static void notBubblesort(int[] a)
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
		}
	}*/

}
