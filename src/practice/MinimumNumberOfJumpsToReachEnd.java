package practice;

/**
 * @author MAHESH BANDAL 21-May-2019 
 * TODO		Given an array of integers where each
 *         element represents the max number of steps that can be made forward
 *         from that element. Write a function to return the minimum number of
 *         jumps to reach the end of the array (starting from the first
 *         element). If an element is 0, then cannot move through that element.
 */
public class MinimumNumberOfJumpsToReachEnd {

	public static void main(String[] args) {
		int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
//		int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length; 
        System.out.print("Minimum number of jumps to reach end is " 
                          + minJumps(arr, 0, n-1)); 

	}

	private static int minJumps(int[] arr, int l, int h) {
		// Base case: when source and destination are same 
		if(h==l)
			return 0;
		// When nothing is reachable from the given source 
		if(arr[l] == 0)
			return Integer.MAX_VALUE;
		
		// Traverse through all the points reachable from arr[l]. 
        // Recursively get the minimum number of jumps needed to reach arr[h] from these 
        // reachable points. 
		int min = Integer.MAX_VALUE;
		for(int i=l+1; i<=h && i<= l+arr[l];i++) {
			int jumps = minJumps(arr, i, h);
			if(jumps != Integer.MAX_VALUE && jumps+1 < min) 
				min=jumps+1;
		}
		return min;
	}

}
