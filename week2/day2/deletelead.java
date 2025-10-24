package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deletelead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("99");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String leadID = firstLead.getText();
        System.out.println("Captured Lead ID: " + leadID);
        firstLead.click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.className("x-paging-info"));
        String resultText = message.getText();

        if (resultText.equals("No records to display")) {
            System.out.println("Lead deletion confirmed successfully.");
        } else {
            System.out.println("Lead was not deleted. Message displayed: " + resultText);
        }
                driver.close();
    }
}

	