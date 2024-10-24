package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		if(title.equals("Dashboard"))
		{System.out.println("Verified the Title");}
		else {System.out.println("Title is not matching");	
		}
		driver.navigate().back();
		boolean btstat=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(btstat==false)
		{System.out.println("Button is disabled");}
				
		Point posi=driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("position of the button:"+posi);
		
		String colr=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println("Background Colour of the button:"+colr);
		
		Dimension size=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		int height = size.height;
		int width = size.width;
		System.out.println("Height and Width of the Button is:"+height+" and  "+width);
		
		driver.close();
		
	}

}
