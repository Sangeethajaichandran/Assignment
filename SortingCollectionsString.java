package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollectionsString {

	public static void main(String[] args)
	{
		String[] company= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> Cmpnylist=new ArrayList<String>(Arrays.asList(company));
		List<String> Reverselist=new ArrayList<String>();
		Collections.sort(Cmpnylist);
		System.out.println("Sorted order :"+Cmpnylist);
		System.out.println("length of the Arraylist :"+Cmpnylist.size());
		
		for(int i=Cmpnylist.size()-1;i>=0;i--)
		{
		Reverselist.add(Cmpnylist.get(i));
		}
		System.out.println("Reversed List:"+Reverselist);
	}

}
