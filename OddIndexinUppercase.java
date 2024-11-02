package day9;

public class OddIndexinUppercase
{
public static void main(String[] args)
	{
		String text="changeme";
		char[] strarr=text.toCharArray();
		for(int i=0;i<text.length();i++)
		{
			if(i%2!=0)
			{
				strarr[i]=Character.toUpperCase(text.charAt(i));
				
				
			}			
		}
		System.out.println(strarr);
	
			}

}
