package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Related_accrecords {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://login.salesforce.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
				.sendKeys("haritha.gajjala15@vamritech.com");
		driver.findElement(By.id("password")).sendKeys("HarithaViswam15");
		
		

		driver.findElement(By.id("Login")).click();
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r6"))).click();
		WebElement searchInput11 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
		searchInput11.sendKeys("related contacts");
		WebElement searchResult11 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']")));
		searchResult11.click();
		
		/*WebElement input111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='combobox-button-235']")));
		input111.click();
		WebElement input211 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value='Contact']")));
		input211.click();*/

	}
}
