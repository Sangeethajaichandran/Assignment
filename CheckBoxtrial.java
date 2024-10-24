package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxtrial {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	String msg=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
	System.out.println(msg);
	if(msg.equals("Checked"))
	{System.out.println("Message is verified");}
	else{System.out.println("Message is not verified");}
	
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-c')]/parent::div")).click();
	Thread.sleep(5000);
	String state=driver.findElement(By.xpath("//span[text()='State has been changed.']")).getText();
	System.out.println(state);
	if(state.equals("State has been changed."))
	{System.out.println("Tri-state option has been chosen");}
	else {System.out.println("Tri-state option has not been chosen");}
	
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	String togg=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
	System.out.println(togg);
	if(togg.equals("Checked"))
	{System.out.println("Toggle switch is checked");
	}
	else
	{System.out.println("Toggle switch is not checked");}
	
	boolean chk=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
	
	System.out.println(chk);
	if(chk==true)
	{System.out.println("check box is enabled");}
	else{System.out.println("check box is disabled");}
	
	}

	}

