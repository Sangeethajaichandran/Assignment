package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffXPath
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//Attribute-Based Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//text based xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Sub')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
	}

}
