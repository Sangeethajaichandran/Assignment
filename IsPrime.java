package day3;

public class IsPrime {

	public static void main(String[] args)
	{
	//declaration of the variable
	int num=13;
	
	//Prime number should be divisible by 1 and by itself
	//prime number should be greater than 1
	
	if(num>0)
	{
		if(num%2==1) 
		{
			System.out.println("This is a Prime Number");
		}
		else
			System.out.println("This is not a Prime Number");
		
	}
	else
		System.out.println("This is not a Prime Number");
	
	
	}

}
