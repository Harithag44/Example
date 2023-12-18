/**
 * 
 */
package com.vamritech.testcases;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author harit
 *
 */
public class Contact_record_creation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		// Add chrome switch to disable notification - "**--disable-notifications**"
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
				.sendKeys("Contacts");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@data-aura-class='forceActionLink' and @title='New']"))).click();
		Thread.sleep(3000);
		driver.findElement(By.tagName("h2")).getText();
		driver.findElement(By.xpath("//*[@name=\"HomePhone\"]")).sendKeys("123");
		String lastname = "LastName-" + getRandomString(7);
		driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys(lastname);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@apiname=\"SaveEdit\"]"))).click();

		Thread.sleep(3000);
		

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"slds-r5\"]"))).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
				.sendKeys("Case");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@data-aura-class='forceActionLink' and @title='New']"))).click();
		Thread.sleep(1000);

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
				.sendKeys(lastname);
		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@class,'slds-listbox__item')]//*[@class='slds-truncate']"))).click();
		String randomEmail = getRandomString(7) + "@gmail.com";
		
		WebElement element = driver.findElement(By.xpath("//*[@name='SuppliedEmail']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		element.sendKeys(randomEmail);
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@apiname=\"SaveEdit\"]"))).click();



	}
	
	protected static String getRandomString(int len) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < len) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
