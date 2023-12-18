package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Component1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
    	//Add chrome switch to disable notification - "**--disable-notifications**"
    	options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait();
		driver.get("https://login.salesforce.com/");
        ((WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))).click();
        ((WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))).sendKeys("durgamdp@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Pandu@3462");
        driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Thread.sleep(2000);
		driver.findElement(By.className("slds-r5")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
				.se("Accounts");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
        Thread.sleep(7000);
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Mr.Burlington Textiles Corp of America  vamritech']"))).click();


	


