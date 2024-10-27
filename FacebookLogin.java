package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String Title=driver.getTitle();
		System.out.println("Title of the page:"+Title);
		if(Title.equals("Forgotten Password | Can't Log In | Facebook"))
		{
			System.out.println("Title is verified");
		}
		else
			System.out.println("Title is not verified");
		
		
	}

}
