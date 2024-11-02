package day10;

public class ReverseOddWordsInString 
{

	public static void main(String[] args) 
	{
	String test="I am a Software Tester";
	String[] splittest = test.split(" ");
	String Rev="";
	int len = splittest.length;
	for(int i=0;i<len;i++)
	{
		if(i%2!=0)
		{
		char chartest[]=splittest[i].toCharArray();
		int len2=chartest.length;
		for(int j=len2-1;j>=0;j--)
		{
		Rev=Rev+chartest[j];
			}
		splittest[i]=Rev;
	}
	}
	String text="";
		for(int k=0;k<len;k++)
		{
			text=(text+splittest[k]+" ");
		}
	System.out.println(text);
	
	
	
	}

}
