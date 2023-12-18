package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accordian12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
    	//Add chrome switch to disable notification - "**--disable-notifications**"
    	options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("durgamdp@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pandu@3462");
		driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Thread.sleep(2000);
		driver.findElement(By.className("slds-r5")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
				.sendKeys("Accounts");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Mr.Dickenson plc  vamritech']"))).click();






	}

}
