package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PRSC_csf {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
					
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	    WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("haritha.gajjala@vamritech.com.remsdev4");
		
		driver.findElement(By.name("pw")).sendKeys("Haritha@44");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		options.addArguments("--disable-notifications");


	       wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r6"))).click();
	        Thread.sleep(3000);
	 
	        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
	        searchInput.sendKeys("PATS Service Center");
	        Thread.sleep(3000);
	        
	 
	        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-label,'PATS Service Center')]//*[@class='slds-truncate']")));
	        searchResult.click();
			//options.addArguments("--disable-notifications");
	        WebElement searchResult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Show Navigation Menu']")));
	        searchResult1.click();
	        Thread.sleep(6000);
	       
	        WebElement csf = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-label='Case Submit Form']")));
	        csf.click();
	        
	        
	        WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='First Name']")));
	        fn.click();
	        fn.sendKeys("Maxi");
	        Thread.sleep(1000);
	        
	 
	        WebElement ln = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Last Name']")));
	        ln.click();
	        ln.sendKeys("Xavier");
	        Thread.sleep(1000);
	        
	        WebElement Email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Email Address']")));
	        Email.click();
	        Email.sendKeys("Hareeg@gmail.com");
	 
	        Thread.sleep(3000);
	        
	        WebElement eid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Employee Id (Ex gbz123)\"]")));
	        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
	        jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", eid);
	        eid.click();
	        eid.sendKeys("VTooo22");
	        Thread.sleep(3000);
		 
	        
	 
	        WebElement isyqr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label=\"Select an Option\"]")));
	        isyqr.click();
	        Thread.sleep(3000);
	         WebElement acr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value=\"Account Receivable\"]")));
	 
	        acr.click();
	        Thread.sleep(3000);
	       
	        
	        
	        WebElement acro = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label=\"Select an Option\"]")));
	        acro.click();
	        Thread.sleep(3000);
	     
	        
	 
	        WebElement acroh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value=\"How-to\"]")));
	        acroh.click();
	        Thread.sleep(3000);
	        
	        
	        
	 
	        WebElement ta = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"slds-textarea\"]")));
	        ta.click();
	        ta.sendKeys("case is created");
	        Thread.sleep(3000);
	        
	        
	        WebElement cb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"slds-checkbox__label\"]")));
	        cb.click();
	        Thread.sleep(3000);
		
	        
	       
	        WebElement conb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Please outline need for urgency\"]")));
	 
	 
	        JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
	        jsExecutor3.executeScript("arguments[0].scrollIntoView(true);", conb);    
	        conb.click();
	        conb.sendKeys("message");
	        Thread.sleep(3000);
	 
	       
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@variant=\"neutral\"]"))).click();
	 
	        WebElement Submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        
	        Submit.click();

	}

}
