package day7;

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
