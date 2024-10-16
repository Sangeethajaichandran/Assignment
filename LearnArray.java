package day3;

import java.util.Arrays;

public class LearnArray 
{

	public static void main(String[] args)
	{
		int Scores[]= {70,20,10,40,50,10,30,70,40};
		//length of Array
		int sclen=Scores.length;
		System.err.println(sclen);//6
		//sorting Array
		Arrays.sort(Scores);
		System.out.println("Minimum Value of Array:"+Scores[0]);//10
		System.out.println("Maximum Value of Array:"+Scores[sclen-1]);//70
		//Retrieve the single data from the array 
		System.out.println(Scores[5]);//70-after sorting array {10,20,30,40,50,70}
		//to print all the values of arrays
		/*for(int i=0;i<=sclen-1;i++)
		{
			System.out.println(Scores[i]);
		}*/
		//Printing Duplicate values
		for(int i=0;i<=sclen-1;i++)
		{
			if(Scores[i]==Scores[i+1])
			{
				System.out.println("Duplicate Number:"+Scores[i]);
			}
		}
		}
	}


