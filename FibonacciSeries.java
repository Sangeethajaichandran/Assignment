package day3;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		 //fibonacci series 0 1 1 2 3 5 8 13
		//declaration of the variable
		int num1=0,num2=1,sum=0;
		System.out.print(num1+" "+num2);
		
		for(int i=2;i<8;i++)
		{
			sum=num1+num2;
			System.out.print(" "+sum);//0 1 1 2 3 5 8 13
			
			num1=num2;
			num2=sum;
		}
		
	}

}
