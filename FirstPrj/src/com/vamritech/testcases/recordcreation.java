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

public class recordcreation {

	/**
	 * @param args
	 */
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
				.sendKeys("Case");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@data-aura-class='forceActionLink' and @title='New']"))).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//label[text()='Status']/following-sibling::*//button"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//label[text()='Status']/following-sibling::*//*[@class='slds-truncate' and text()='Working']")))
				.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//label[text()='Case Origin']/following-sibling::*//button"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//label[text()='Case Origin']/following-sibling::*//*[@class='slds-truncate' and text()='Phone']")))
				.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search Contacts...')]")))
				.sendKeys("Lakshmi GAJJALA");
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"dropdown-element-409\"]/ul//*[@class='slds-truncate']")))
				.click();
		WebElement element = driver.findElement(By.xpath("//*[@id='input-346']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		element.sendKeys("user1@gmail.com");
		Thread.sleep(1000);
		WebElement desc_element = driver.findElement(By.xpath("//*[@id=\'input-395\']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", desc_element);
		desc_element.sendKeys("Case Creation through Selenium");
		Thread.sleep(5000);
		WebElement checkbox = driver.findElement(By.xpath(
				"//*[@id=\"content_1186:0\"]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-form-footer/div/div[1]/force-form-footer-save-options/ul/li"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", checkbox);
		checkbox.click();
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@apiname=\"SaveEdit\"]"))).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
