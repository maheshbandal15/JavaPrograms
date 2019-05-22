package technicalRound;

public class PatternOneLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Print * pattern using single loop only
		/*int i,j=0,n=5;
		for(i=1;i<=n;)
		{
			if(j<i)
			{
				System.out.print("*");
				j++;
			}
			if(i==j)
			{
				System.out.println("");
				i++;
				j=0;
			}
		}*/
		int i,j=0,n=5;
		for(i=1;i<=n;)
		{
			if(j<i)
			{
				System.out.print(j+1);
				j++;
			}
			if(i==j)
			{
				System.out.println("");
				i++;
				j=0;
			}
		}
	}

}
