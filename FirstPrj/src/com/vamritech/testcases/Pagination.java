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

public class Pagination {

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
				.sendKeys("Pagination");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		Thread.sleep(2000);
		WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'search for account')]")));
		input.sendKeys("haritha");
		input.click();
		Thread.sleep(3000);

		WebElement NextButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral' and text()='Next']"));
		Thread.sleep(3000);

	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].click();", NextButton);
	    // JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	     //jsExecutor.executeScript("arguments[0].scrollIntoView();", targetElement);
	        NextButton.click();
		    


			

		

	}

}
