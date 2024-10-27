package day7;

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
