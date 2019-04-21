package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,60,35,2,65,45,320,5,-1};
//		sort(arr);
//		heapsort(arr);
		quickSort(arr, 0, arr.length-1);
		for(int i: arr) {
			System.out.print(i+",");
		}
	}
	static void quickSort(int[] arr,int low, int high) {
		int m;
		if(low<high) {
			m=partition(arr, low, high);
			quickSort(arr, low, m-1);
			quickSort(arr, m+1, high);
					
		}
	}
	static int partition(int[] arr,int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[high];
		arr[high]=arr[i+1];
		arr[i+1]=temp;
		return i+1;
	}
	static void  heapsort(int[] arr) {
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) {
			hippify(arr, n, i);
		}
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			hippify(arr, i,0);
		}
	}
	static void hippify(int[] arr, int n, int i) {
		int largest=i;
		int l= 2*i+1;
		int r= 2*i+2;
		
		if(l<n && arr[l] >arr[largest])
			largest=l;
		if(r<n && arr[r] >arr[largest])
			largest=r;
		if(i!=largest) {
			int temp =arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			hippify(arr, n, largest);
		}
	}
	static void sort(int[] arr) {
		int k;
		for(int i=0; i<arr.length-1;i++) {
			k=i;
			for(int j=i+1;j<arr.length; j++) {
				if(arr[j]<arr[k])
					k=j;
			}
			if(k!=i) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
			
		}
		/*for(int i=0; i<arr.length;i++)
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}*/
		/*for(int i=1; i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
		}*/
	}
}
