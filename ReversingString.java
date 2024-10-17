package day4;

public class ReversingString {

	public static void main(String[] args)
	{
	String str="Sangeetha";
	char[] revstr=str.toCharArray();
	System.out.println(revstr);
	for(int i=revstr.length-1;i>=0;i--)
	{
		System.out.print(revstr[i]);
	}
	}

}
