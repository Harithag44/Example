package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LPrsc_2 {

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
	        

	}

}
