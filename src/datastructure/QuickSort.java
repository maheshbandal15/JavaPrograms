package datastructure;

public class QuickSort {
	static int count=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {3,60,35,2,45,320,5};
//		int a[] = {1,12,9,5,6,10,0};
		int a[] = {2,3,5,45,60,320,35};
		int low=0,high=a.length-1;
		for(int i:a)
			System.out.print(i+" ");
		quickSort(a,low,high);
		System.out.println("");
		for(int i:a)
			System.out.print(i+",");
	}
	static void quickSort(int a[],int low,int high)
	{
		int m;
		if(low < high)
		{
			m=partition(a,low,high);
			quickSort(a, low, m-1);
			quickSort(a, m+1, high);
		}
	}
	/* This function takes last element as pivot, places the pivot element at its correct
    position in sorted array, and places all smaller (smaller than pivot) to left of pivot and
    all greater elements to right of pivot */
	static int partition(int a[],int low,int high)
	{
		int pivot = a[high]; 
		int i = (low-1); // index of smaller element
		for (int j=low; j<high; j++)
		{
			// If current element is smaller than or
			// equal to pivot
			if (a[j] <= pivot)
			{
				i++;

				// swap a[i] and a[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		// swap a[i+1] and a[high] (or pivot)
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		
		
		System.out.println("\nafter "+count+" th pass");
		for(int x:a)
			System.out.print(x+" ");
		count++; //for counting number of passes
		return i+1;
	}
}
/* Output :
			3 60 35 2 45 320 5 
			after 1 th pass
			3 2 5 60 45 320 35 
			after 2 th pass
			2 3 5 60 45 320 35 
			after 3 th pass
			2 3 5 35 45 320 60 
			after 4 th pass
			2 3 5 35 45 60 320 
			2 3 5 35 45 60 320 
*/
/*static int partition(int a[],int low,int high)
{
	int p=a[low];
	int i=low;
	int j=high,temp;
	while(i<j)
	{
		while(a[i]<=p)
			i++;
		while(a[j]>p)
			j--;
		if(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	temp=a[low];
	a[low]=a[j];
	a[j]=temp;
	return j;
}
*/