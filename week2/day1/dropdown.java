package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("mastek22");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abishek");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saravanan");
		WebElement sourcedd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourcedd);
		sel.selectByIndex(4);
		WebElement mcdd=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1=new Select(mcdd);
		sel1.selectByVisibleText("Automobile");
		WebElement ownershipdd=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2=new Select(ownershipdd);
		sel2.selectByValue("OWN_CCORP");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		   String title = driver.getTitle();
	        System.out.println("Page Title: " + title);
	        driver.close();
	        
		
			
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mastek");
		
		
		
		
		

	}

}
