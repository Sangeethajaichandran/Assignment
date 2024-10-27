package day7;

public class Browser {
	String browserName;
	float browserVersion;
	public void openUrl()
	{System.out.println("open url");}
	public void closeBrowser()
	{System.out.println("close browser");}
	public void navigateBack()
	{System.out.println("navigate browser");}


}

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

public class Safari extends Browser {
	public void readerMode()
	{System.out.println("Reader mode-Safari");}
	public void fullScreenmode()
	{System.out.println("Fullscreen mode-Safari");}
	

	public static void main(String[] args) 
	{
		Safari sf=new Safari();
		sf.readerMode();
		sf.fullScreenmode();
		sf.openUrl();
		sf.closeBrowser();
		sf.navigateBack();
		sf.browserName="Safari";
		sf.browserVersion=28.4f;
		System.out.println("Browser Name:"+sf.browserName);
		System.out.println("Browser version:"+sf.browserVersion);
		
			
	}

}


public class Edge extends Browser {

	public void takeSnap()
	{System.out.println("Taken Snapshot--Edge");}
	public void clearCookies()
	{System.out.println("Cleared Cookies--Edge");}

	public static void main(String[] args) 
	{
		Edge ed=new Edge();
		ed.openUrl();
		ed.closeBrowser();
		ed.navigateBack();
		ed.browserName="Edge";
		ed.browserVersion=22.4f;
		System.out.println("Browser Name:"+ed.browserName);
		System.out.println("Browser version:"+ed.browserVersion);
		
		
	}

}
