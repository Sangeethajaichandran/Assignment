package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sangeetha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jaichandran");
		driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("SELENIUM");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement Title=driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']"));
		String ChkTitle=Title.getText();
		if (ChkTitle.equals("SELENIUM"))
				{
			System.out.println("Title is matching");
				}
		else
			System.out.println("Title is not matching");
		
		driver.close();
		
		
		
		
		
		
		
	}

}
