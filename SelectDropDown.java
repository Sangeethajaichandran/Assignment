package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");
		
		WebElement sourcedrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//create an object for the select class
		Select sel=new Select(sourcedrop);
		//selecting option-direct mail
		//select by index
		sel.selectByIndex(3);
		
		
		WebElement MC = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2=new Select(MC );
		//select by visible text
		sel2.selectByVisibleText("eCommerce Site Internal Campaign");
		
		//select by value
		WebElement IND = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel3=new Select(IND);
		sel3.selectByValue("IND_HEALTH_CARE");
		
	}


		
		
		
	}


