package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class relatedaccrecords2 {

	public static void main(String[] args) throws Exception {
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
				.sendKeys("related contacts");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		Thread.sleep(2000);
		WebElement input1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='combobox-button-235']")));
        input1.click();
        WebElement input2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-value='Contact']")));
        input2.click();

}
}
