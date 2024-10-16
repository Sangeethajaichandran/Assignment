package day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
	//Declaration of Array with Sequential Values
		int a[]= {1,4,6,8,3,7,2};
		int arrlen=a.length;
		Arrays.sort(a);
		
		for(int i=0;i<arrlen;i++)
		{
			if(a[i]!=(i+1))
			{
				System.out.println("Missing number of the Array:"+(i+1));//5
				break;
			}
		}
		
	}

}
