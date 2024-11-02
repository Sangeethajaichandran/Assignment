package day11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesnAlertHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();	//button[normalize-space()='Try it']"
		Alert namealert=driver.switchTo().alert();
		namealert.sendKeys("Dany");
		namealert.accept();
		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
	
		System.out.println("Text:"+text);
		if(text.contains("Dany"))
		{
			System.out.println("Text is Verified");
		}
		else
			System.out.println("Text is not Verified");
	
	}
	}


