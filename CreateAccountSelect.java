package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("jack");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		WebElement selindus=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select indus=new Select(selindus);
		indus.selectByIndex(3);
		
		WebElement selown=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select owner=new Select(selown);
		owner.selectByVisibleText("S-Corporation");
				
		WebElement selsource=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select source=new Select(selsource);
		source.selectByValue("LEAD_EMPLOYEE");
				
		WebElement selcamp=driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select campaign=new Select(selcamp);
		campaign.selectByIndex(6);
		
		WebElement selstate=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state=new Select(selstate);
		state.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		WebElement AccName=driver.findElement(By.xpath("//span[@id='ext-gen1162']"));
		String Account=AccName.getText();
		System.out.println(Account);
		if(Account.equals("jan"))
		{
			System.out.println("Account Name is verified");
		}
		
		else
			System.out.println("Account Name is not verified");
	
						
		
	}

}
