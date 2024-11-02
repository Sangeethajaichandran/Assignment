package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumbersList {

	public static void main(String[] args) 
	{
	Integer[] num= {1,2,3,4,10,6,8};
	List<Integer> number=new ArrayList<Integer>(Arrays.asList(num));
	Collections.sort(number);
	System.out.println("Sorted Number:"+number);
	int firstnum=number.getFirst();
	System.out.println("FirstNumber:"+firstnum);//1
	int lastnum=number.getLast();
	System.out.println("LastNumber:"+lastnum);//10
	
	for(int i=firstnum+1;i<lastnum;i++)
	{
		if(!number.contains(i))
		{
			
			System.out.println(i);//5  7  9
		}
	}
	
	}

}
