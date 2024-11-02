package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionOfArraywithList {

	public static void main(String[] args) 
	{
		Integer[] lis1 ={3,2,11,4,6,7};
		Integer[] lis2= {1,2,8,4,9,7};
		List<Integer> lint1 = new ArrayList<Integer>(Arrays.asList(lis1));//adding arrayelement into list
		
		List<Integer> lint2 = new ArrayList<Integer>(Arrays.asList(lis2));
		
		List<Integer> inter = new ArrayList<Integer>();
		System.out.println("Intersection of numbers:");
		for(int i = 0; i<lint1.size(); i++ ) 
		{
	        for(int j = 0; j<lint2.size(); j++) 
	        {
	           if(lint1.get(i)==lint2.get(j))
	           {inter.add(0, lint2.get(j)); 
	           Collections.sort(inter);
	     	   }
		}}
		System.out.println(inter);//output-Intersection of numbers:[2, 4, 7]

		
	}
}
