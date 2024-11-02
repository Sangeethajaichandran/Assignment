package day10;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setuniquestring {

	public static void main(String[] args) 
	{
		String company= "google";
		
		Set<Character> Cmpname=new LinkedHashSet<Character>();
		char[] uniqchar=company.toCharArray();
		for(int i=0;i<uniqchar.length;i++)
		{
			boolean b = Cmpname.add(uniqchar[i]);
			
		}
		System.out.println(Cmpname);
		
	}

}
