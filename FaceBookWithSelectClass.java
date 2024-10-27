package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookWithSelectClass {

	public static void main(String[] args)
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[contains(@class,'selected ')]")).click();	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dany");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Matthias");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')][1]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("1431");
		
		WebElement date=driver.findElement(By.xpath("//select[contains(@name,'birthday')][1]"));
		Select seldat=new Select(date);
		seldat.selectByIndex(5);
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@name,'birthday')][2]"));
		Select selmonth=new Select(month);
		selmonth.selectByVisibleText("Oct");
			
		WebElement year=driver.findElement(By.xpath("//select[contains(@name,'birthday')][3]"));
		Select selyear=new Select(year);
		selyear.selectByVisibleText("2010");
		
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	
	
	}

}
