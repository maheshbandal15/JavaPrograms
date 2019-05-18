package technicalRound;

public class RajaSoftQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="I.will.beome.successfull";
		String[] str2=str1.split("[.]"); 
		for(String s :str2)
		{
			System.out.print(s+",");
		}
//		Iterator<String> itr=str2.iterator();
		System.out.println("");
		for (int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]+".");
		}
//		for(int i=0;i<str2.length;i++)
//		{
//			System.out.println(str2[i]);
//		}
//		System.out.println("");
//		int [][]arr= new int [3][];
//		arr[0]=new int [2];
//		arr[1]=new int [3];
//		arr[2]=new int [4];
//		int count=0;
//		for (int row=0;row <arr.length;++row)
//		{
//			for(int col=0;col<arr[row].length;++col)
//			{
//				System.out.print(arr[row][col]);
//				count++;
//			}
//		}
//		System.out.println("\n"+count);
	}

}

/*
 * Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. Let's see the simple example:

class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
}  
*/
