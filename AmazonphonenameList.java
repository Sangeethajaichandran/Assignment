package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonphonenameList {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobiles",Keys.ENTER);
		//printing list of prices
		List <WebElement> allprices=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String> list=new ArrayList <String>();
		for (WebElement price : allprices) 
		{
			String Prices=price.getText();
			list.add(Prices);
			}
		System.out.println(list);
		
		
	}

}
