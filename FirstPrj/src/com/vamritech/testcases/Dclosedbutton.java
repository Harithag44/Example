package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dclosedbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
			driver.get("https://login.salesforce.com/");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
					.sendKeys("haritha.gajjala15@vamritech.com");
			driver.findElement(By.id("password")).sendKeys("Haritha@44");
			driver.findElement(By.id("Login")).click();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.className("slds-r5")).click();
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
					.sendKeys("Case");
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='00001036']"))).click();
	        Thread.sleep(7000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Case.Closed_Button']"))).click();
	        Thread.sleep(7000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='navigation-bar__right-align']"))).click();
	        Thread.sleep(7000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Case.Closed_Button']"))).click();
	        Thread.sleep(7000);

			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
