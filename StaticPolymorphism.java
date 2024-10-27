package day7;

public class StaticPolymorphism
{
	public void reportStep(String msg,String Status)
	{System.out.println(msg);
	System.out.println(Status);}
	public void reportStep(String msg,String Status,boolean snap)
	{
		System.out.println(msg);
		System.out.println(Status);
		System.out.println(snap);
}
	//method overloading
	public static void main(String[] args)
	{
		StaticPolymorphism stp=new StaticPolymorphism();
		stp.reportStep("Welcome", "Done");
		stp.reportStep("Hello", "finished", false);
	
		
	}

}
