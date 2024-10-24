package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sangeetha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jaichandran");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("san");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("selenium is my favourite");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("san@gmail.com");
		WebElement statpro=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(statpro);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Selenium is the best testing tool");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		
		driver.close();
		
		
	}

}
