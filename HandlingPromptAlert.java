package day10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptAlert {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement prompt=driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		prompt.click();
		Alert pralert=driver.switchTo().alert();
		pralert.sendKeys("notinspectable");
		System.out.println(pralert.getText());
		
		pralert.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		
		
		
	}

}
