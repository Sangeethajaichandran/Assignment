package day7;

public class SubclassMethodOveridding extends StaticPolymorphism
{
	public void reportStep(String msg,String Status,boolean snap)
	{
		System.out.println(msg);
		System.out.println(Status);
		System.out.println(snap);
}
	public static void main(String[] args) 
	{
		SubclassMethodOveridding mov=new SubclassMethodOveridding();
		mov.reportStep("overidden", "Finished");
		mov.reportStep("Subclass", "completed", true);
		
	}

}
