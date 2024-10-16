package day3;

public class FindIntersection 
{
	public static void main(String[] args) 
	{	//declaration of Arrays
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		int aArr=a.length;
		int bArr=b.length;
		
		//finding Intersection of 2Arrays using normal for loop
		for(int i=0;i<=aArr-1;i++)
		{
			for(int j=0;j<=bArr-1;j++)
			{
				if(a[i]==b[j])
						{
			System.out.println("Intersection Number is:"+a[i]);
					
						}
			}
		}
		
	}

}
