package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Updateaccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		// Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://login.salesforce.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
				.sendKeys("haritha.gajjala15@vamritech.com");
		driver.findElement(By.id("password")).sendKeys("HarithaViswam15");
		driver.findElement(By.id("Login")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("slds-r5")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
				.sendKeys("Accounts");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-recordid='0015g00001LXycmAAD']"))).click();

        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='update account']"))).click();

          
          WebElement accountNameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']")));

          accountNameInput.click();
          accountNameInput.clear();

          accountNameInput.sendKeys("TEST1006");
          Thread.sleep(2000);

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Industry']/following-sibling::*//button"))).click();

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Industry']/following-sibling::*//*[@data-value='Agriculture']"))).click();

          
          
        
        
         WebElement accountphone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Phone']")));

         accountphone.click();
         accountphone.clear();

         accountphone.sendKeys("765431");
          Thread.sleep(2000);
          
          WebElement Next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
          Next.click();
	
          WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='LastName']")));
          lastname.sendKeys("haritha");
          
          WebElement Next1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
          Next1.click();
          
          WebElement oppname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']")));
          oppname.sendKeys("Haritha.g");
          
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//button"))).click();

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Stage']/following-sibling::*//*[@data-value='Prospecting']"))).click();

          WebElement closedate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='CloseDate']")));
          closedate.click();
          
          closedate.sendKeys("8/31/2023");



          Thread.sleep(3300);
          WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
         
          Save.click();
          
          
          Thread.sleep(3300);

	}



}


