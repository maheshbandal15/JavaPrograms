package practice;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str1="mahes";
		Set<Character> ch= new HashSet<Character>();
		char[] charArr= str1.toCharArray();
		int flag=0;
		for(char c : charArr)
		{
			if(ch.contains(c)) {
				flag=1;
				break;
			}
			else 
				ch.add(c);
		}
		if(flag==0)
			System.out.println("string has uniq chars");
		else
			System.out.println("string doesnt have uniq chars");*/
		
		String str2="ENGINEERING";
		Map<Character,Integer> m1= new HashMap<Character,Integer>();
		char[] charArr1= str2.toCharArray();
		for(char c : charArr1)
		{
			if(m1.containsKey(c))
			{
				m1.put(c, m1.get(c)+1);
			}
			else
				m1.put(c, 1);
		}
		System.out.println(m1.values());
		System.out.println(m1.keySet());
		/*Iterator<Character> itr=m1.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.toString());
		}*/
			
	}

}
