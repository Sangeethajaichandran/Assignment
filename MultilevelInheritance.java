package day7;

public class MultilevelInheritance extends Edge
{
public void mullv3()
{
	System.out.println("im from multilevel 3");
	}
	public static void main(String[] args) 
	{
		MultilevelInheritance mullvin=new MultilevelInheritance();
		mullvin.openUrl();
		mullvin.closeBrowser();
		mullvin.takeSnap();
		mullvin.clearCookies();
	//here we inherit edge which inturn inherits browser
		//so v can inherits the attributes anf=d methiods from both edge and browser
	}

}
