package com.vamritech.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class Lazy_Loading {

	public static void main(String[] args) throws InterruptedException {
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
				.sendKeys("Lazy Loading");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();
		Thread.sleep(4000);
		/*
		 * WebElement targetElement =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//*[@class='slds-scrollable_y']"))); // Scroll down to the target element
		 * using JavaScript JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 * jsExecutor.executeScript("arguments[0].click();", targetElement); //
		 * JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 * //jsExecutor.executeScript("arguments[0].scrollIntoView();", targetElement);
		 * targetElement.click();
		 */

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebElement targetElement = wait
		// .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='slds-scrollable_y']")));
		// Scroll down to the target element using JavaScript to bring it into view
		// JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// jsExecutor.executeScript("arguments[0].scrollIntoView(true);",
		// targetElement);
		// Now you can interact with the element (e.g., click on it)
		// targetElement.click();
		// WebElement targetElement1 =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='oslds-scrollable_y']")));
		// Scroll down to the target element using JavaScript to bring it into view
		// JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		// jsExecutor1.executeScript("arguments[0].scrollIntoView(true);",
		// targetElement1);
		// Now you can interact with the element (e.g., click on it)
		// targetElement1.click();

	//	 JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("window.scrollBy(0,250)");
	//	 jse.executeScript("scroll(0, 250);");

	//	 Thread.sleep(2000);
		 
		// WebElement element = driver.findElements(By.xpath("//table[@id =
		// 'tableID']//tr[last()]")).

		// WebElement targetElement = wait.until(
		// ExpectedConditions.elementToBeClickable(By.xpath("//table[@class =
		// 'slds-table slds-table_header-fixed slds-table_bordered slds-table_edit
		// slds-table_resizable-cols']//tr[last()]")));

		WebElement element = driver.findElement(By.xpath(
				"//table[@class = 'slds-table slds-table_header-fixed slds-table_bordered slds-table_edit slds-table_resizable-cols']//tr[last()]"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		
	//	JavascriptExecutor js;
	//	js = (JavascriptExecutor) driver;
	//	js.executeScript("$(\".slds-table slds-table_header-fixed slds-table_bordered slds-table_edit slds-table_resizable-cols\").animate({ scrollBottom: \"100px\" })");
	}

}
