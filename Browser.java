package day3;

public class Browser {
	
	String launchBrowser(String browserName)
	{
	System.out.println("Browser Launched Successfully");
		return browserName;	
	}
	
	 void loadUrl()
	{
		System.out.println("Application Url Loaded Successfully");
	}
public static void main(String[] args) 
	{		Browser bm=new Browser();
			System.out.println(bm.launchBrowser("Chrome"));
			bm.loadUrl();
}

}
