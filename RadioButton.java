package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		
		WebElement sel=driver.findElement(By.xpath("(//label[text()='Chennai'])[1]"));
		sel.click();
		WebElement unsel=driver.findElement(By.xpath("(//label[text()='Chennai'])[1]"));
		unsel.click();
		boolean Unselected=unsel.isSelected();
		if(Unselected==false)
		{System.out.println("Radio button is Unselected");}
		else
		{System.out.println("Radio is not Unselected");}
		
		WebElement dft=driver.findElement(By.xpath("//input[@value='Option3']"));
		boolean dftselected = dft.isSelected();
		System.out.println(dftselected);
		if(dftselected==true)
		{System.out.println("Default radio button is Selected");}
		else
		{System.out.println("Default radio button is not Selected");}
		
		WebElement age=driver.findElement(By.xpath("//input[@value='21-40 Years']"));
		boolean selage= age.isSelected();
		if(selage==true)
		{
			System.out.println("Age Group is selected by default");
		}
		else
		{age.click();}
		
		
		
		
	}

}
