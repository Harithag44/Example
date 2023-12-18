package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Data_table {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
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
				.sendKeys("Data table");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		WebElement searchInput2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='check-button-label-1-259']")));
        searchInput2.click();
        WebElement searchInput3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='check-button-label-3-277']")));
        searchInput3.click();
        
        WebElement searchInput4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='check-button-label-5-295']")));
        searchInput4.click();
        
	}
}


