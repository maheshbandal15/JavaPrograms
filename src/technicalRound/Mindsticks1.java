package technicalRound;

/*	Index 0 1 2 3 4
	Value- 4 3 1 2 0
	
	Result -0 4 9 1 16
	
	(O/p Explaination- at 0th index value is 4 so we have to check the value at index 4 and square it means
	0x0=0 ,	and place the value at 0th index in same array).
	Array and length of array is given. We have to write only function body taking array as parameter.
	(no scanf should be used)
	Program should not use temporary array.
*/
public class Mindsticks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,3,1,2,0};
//		int val;
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[a[i]]*a[a[i]];
		}
		for(int x:a)
		System.out.print(x+" ");
	}

}
