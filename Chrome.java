package day7;

public class Chrome extends Browser 
{
	public void openIncognito()
	{System.out.println("open incognito--chrome");}
	public void clearCache()
	{System.out.println("Cleared cache--chrome");}

	public static void main(String[] args) 
	{
		Chrome c=new Chrome();
		c.openUrl();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
		c.browserName="Chrome";
		c.browserVersion=11.25f;		
		System.out.println("Browser Name:"+c.browserName);
		System.out.println("Browser version:"+c.browserVersion);
		
		
	}

}
