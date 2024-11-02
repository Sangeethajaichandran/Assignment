package day9;

public class FindingDuplicatewordsstring
{

	public static void main(String[] args)
	{
		String text="We learn Java basics as part of java sessions in java week1";
		String text1=text.toLowerCase();
		String[] arr=text1.split(" ");
		System.out.println("Length of the text:"+arr.length);//12
		
		int count=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]).equals(arr[j]))
				{
					arr[j]="";
					count=1;
				}
			}
		}
			if(count==1)
			{
				for(int k=0;k<arr.length;k++)
				{
				System.out.print(arr[k]+"");
				}
			}
		}
	
	}


