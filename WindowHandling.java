package day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
					
	    driver.findElement(By.xpath("//input[@value='Login']")).click();//login
	    driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	    String parentwindow=driver.getWindowHandle();
	    //for clicking for widget of "From contact" under merge contact
	    driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
	   
	    //get all the windows
	    Set<String> mergewin=driver.getWindowHandles();
	    
	    //convert set into list
	    List<String> MergeWindow=new ArrayList<String> (mergewin);
	    
	    //navigate to child window
	    driver.switchTo().window(MergeWindow.get(1));
	    //Address of the child window
	    String windowhandle=driver.getWindowHandle();
	    System.out.println("Address of the first child window:"+windowhandle);
	    //title of the child
	    System.out.println("Title of the first child window:"+driver.getTitle());
	    
	    //for clicking first resulting contact
	    driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr//td[1]")).click();
	    
	    //switching from child to parent window to perform second widget clicking action
	    driver.switchTo().window(parentwindow);
	    
	  //for clicking for widget of "To contact" under merge contact
	    driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
	    
	    //get all the windows
	    Set<String> merge2win=driver.getWindowHandles();
	    
	    //convert set into list
	    List<String> Merge2Window=new ArrayList<String> (merge2win);
	    
	    //navigate to child window
	    driver.switchTo().window(Merge2Window.get(1));
	    //Address of the child window
	    String window2handle=driver.getWindowHandle();
	    System.out.println("Address of the second child window:"+window2handle);
	    //title of the child
	    System.out.println("Title of the second child window:"+driver.getTitle());
	    
	    //for clicking second resulting contact
	    driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tbody//tr/td[1])[3]")).click();
	  
	    //switching from child to parent window to perform merge clicking action
	    driver.switchTo().window(parentwindow);
	    
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();	
	    
	    Alert mergeconfrm=driver.switchTo().alert();
	    mergeconfrm.accept();
	    
	  //switching from childwindow2 to parent window to verify the title of the page
	    driver.switchTo().window(parentwindow);
	    
	    String PageTitle=driver.getTitle();
	    
	    if(PageTitle.equals("Merge Contacts | opentaps CRM"))
	    {
	    System.out.println("Title is Verified");
	    }
	    else
	    	System.out.println("Title is not Verified");
	    	
	}

}
