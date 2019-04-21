package practice;

/**
 * @author Mahesh Bandal
 * WAP to find a number nearest to zero in an array. If array contains -1 and 1 then it should return 1
 */
public class FindNumberNearestToZeroInArray {

	public static void main(String[] args) {
		int[] arr= {43,1,2,4,-2,5,9,-1,34,100};
		int distance,temp=findDistanceFromZero(arr[0]), nearest=arr[0];
		for(int i=1; i<arr.length; i++) {
			distance=findDistanceFromZero(arr[i]);
			if(distance ==0) {
				nearest=arr[i];
				break;
			} else if(distance==temp) {
				nearest =(arr[i]<0) ?arr[i]*(-1) :arr[i];
			} else if(distance<temp) {
				temp=distance;
				nearest=arr[i];
			}
		}
		System.out.println("Number nearest to zero is :"+ nearest);
	}
	static int findDistanceFromZero(int i) {
		if(i<0)
			return 0-i;
		return i-0;
	}

}
