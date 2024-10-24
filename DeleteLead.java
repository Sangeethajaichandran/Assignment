package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("123");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='14391']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("14391");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
	String Result=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	System.out.println("Search Result:"+Result);	
	if(Result.equals("No records to display")) 
	 {System.out.println("Successfully deleted the lead");}
else {System.out.println("lead is not selected");}

		
		 
				
		
	
	
	}

}
