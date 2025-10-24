package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Mastek1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Abi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sarav");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Local name");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test2@yopmail.com");
		WebElement Statedd=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1=new Select(Statedd);
		sel1.selectByVisibleText("Armed Forces Americas");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.className("smallSubmit")).click();
		String pageTitle = driver.getTitle();
        System.out.println("Resulting Page Title: " + pageTitle);
        driver.close();
        
		
		
		
		

	}

}
