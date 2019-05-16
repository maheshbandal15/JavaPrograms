package practice;

public class MergeTwoUnsortedArray {

	public static void main(String[] args) {
		int[] arr1 = {2,4,34,64,34,23,23,2,44,20,49,202,37,98,67};
		int arr2[]= {3,60,35,2,65,45,320,23,1,20,5,-1};
		 MergeTwoUnsortedArray mergeTwoUnsortedArray = new MergeTwoUnsortedArray();
		 int a[] = mergeTwoUnsortedArray.mergeTwoArray(arr1, arr2);
		 mergeTwoUnsortedArray.sort(a);
		 for(int i: a)
			 System.out.print(i+",");
	}
	public int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int[] temp= new int[arr1.length+arr2.length];
		int counter=0;
		for(int i : arr1)
			temp[counter++] =i;
		for(int i : arr2)
			temp[counter++] =i;
		return temp;
	}
	public void sort(int[] arr) {
		for(int i=0; i<arr.length-1;i++)
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	}

}