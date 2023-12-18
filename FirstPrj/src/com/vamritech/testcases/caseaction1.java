package com.vamritech.testcases;

import java.io.ObjectInputFilter.Status;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class caseaction1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://login.salesforce.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
				.sendKeys("haritha.gajjala15@vamritech.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("HarithaViswam15");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Login")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.className("slds-r7")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
				.sendKeys("Case");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='00001036']"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-value='Waiting for the customer']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@data-value='In progress']")).click();
		Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@data-value='Solved']")).click();
		Thread.sleep(2000);

        /*wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@title='Cases']"))).click();*/
		Thread.sleep(2000);
		driver.findElement(By.className("slds-context-bar__label-action dndItem")).click();

       



		}

		

	}


