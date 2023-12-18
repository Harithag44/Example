package com.vamritech.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Case_Submit_Form {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\harit\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		    //WebDriver driver = new ChromeDriver();
			driver.get("https://remsdev4-dev-ed.my.salesforce.com/");
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("haritha.gajjala@vamritech.com.remsdev4");
			driver.findElement(By.name("pw")).sendKeys("HarithaViswam15");
			driver.findElement(By.name("Login")).click();
		    //wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
		    //wait.until(ExpectedConditions.elementToBeClickable(By.className("input r4 wide mb16 mt8 username"))).sendKeys("haritha.gajjala@vamritech.com.remsdev4");
	Thread.sleep(2000);        
	//driver.findElement(By.id("password")).sendKeys("HarithaViswam15");
	        driver.findElement(By.id("Login")).click();
	        driver.manage().window().maximize();
	        Thread.sleep(8000);
	        
	}

}
