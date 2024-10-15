package day2;

public class IsPrime 
{
public static void main(String[] args)
{
	//prime number condition
	//Natural Number>1,number should be divisible by 1,number shd be divisible by itself
	
	int num=19;
	int count=0;
	
	if(num>0)
	{
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		count++;
	}	
		if(count==2)
		{
			System.out.println("This is a Prime Number");
		}
		else
			System.out.println("This is not a Prime Number");
	}
	
	else
	{
		System.out.println("This is not a Prime Number");
	}
}
	
}