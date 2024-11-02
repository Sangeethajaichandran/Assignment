package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest 
{

	public static void main(String[] args) 
	{
		Integer[] number= {3,2,11,4,6,7};
		List<Integer> listnum=new ArrayList<Integer>(Arrays.asList(number));
		Collections.sort(listnum);
		System.out.println("Sorted list:"+listnum);//Sorted list:[2, 3, 4, 6, 7, 11]
		System.out.println("Largest Number:"+listnum.getLast());//Largest Number:11
		Integer numlen = listnum.size();
		System.out.println(numlen);//6
		Integer SecLarge=listnum.get(numlen-2);
		System.out.println("Second largest Number:"+SecLarge);//Second largest Number:7
		
	}

}
