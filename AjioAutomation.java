package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAutomation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search=driver.findElement(By.xpath("//input[@name='searchVal']"));
		search.sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(5000);
		String NoOfItems=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Number of Items found:"+NoOfItems);
		
		List<WebElement> brandname=driver.findElements(By.xpath("//div[@class='brand']"));
		
		//list interface for printing list of brand names
		List<String> brandlist=new ArrayList<String>();
		for (WebElement brand : brandname)
		{String text = brand.getText();
		brandlist.add(text);}
		System.out.println("List of Brand Names:"+brandlist);
		
		//list interface for printing list of bag names
		List<WebElement> bagname=driver.findElements(By.xpath("//div[@class='nameCls']"));
		
				List<String> baglist=new ArrayList<String>();
				for (WebElement bags : bagname)
				{String bagtext = bags.getText();
				baglist.add(bagtext);}
				System.out.println("List of Bag Names:"+baglist);
				
	}

}
