package day11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling 
{

	public static void main(String[] args)
	{WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert button=driver.switchTo().alert();
	button.accept();
	String result=driver.findElement(By.id("demo")).getText();

	System.out.println(result);
	if(result.equals("You pressed OK!"))
	{
	System.out.println("Text is verified");
	}else
		System.out.println("Text is not verfied");
	}
}
