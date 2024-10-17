package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	//Maximize the window
	driver.manage().window().maximize();
	//Launch URL
	driver.get("https://www.facebook.com/");
	//Get Title of the page
	String Browsername=driver.getTitle();//Facebook – log in or sign up
	System.out.println(Browsername);
	//close the browser
	driver.close();
	
	}

}
