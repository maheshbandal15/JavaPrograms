package technicalRound;

public class RajaSoftQ3 {
	public static void main(String[] args) {
//		String str1 = "abcd",str2="";
		String str1 = "aabcccccaaa",str2="";
		int count,j;
		for(int i=0;i<str1.length();i++)
		{
			count=1;
			for(j=i+1;j<str1.length();j++ )
			{
				if(str1.charAt(i)==str1.charAt(j))
					count++;
				else
				{
					i=j-1;
					break;
				}
			}
			str2 = str2+str1.charAt(i)+""+count;
			if(j==str1.length())
				i=j;
		}
		if(str2.length()>str1.length())
		{
			System.out.println(str1);
		}
		else
			System.out.println(str2);
	}
}
