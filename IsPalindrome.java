package day3;

public class IsPalindrome 
{

	public static void main(String[] args) 
	{
	
	
		int number=121;
		int reversenum=0;
		int temp=number;
		while(temp>0)
		{
			int reminder=temp%10;
			reversenum=reversenum*10+reminder;
			temp=temp/10;
		}
	if(number==reversenum)
	{System.out.println("This is a palindrome number");}
	else
	{System.out.println("This is not a palindrome number");}
	
	
	}

}
