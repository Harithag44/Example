   package com.vamritech.testcases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleAccountInsertionComp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
        driver.get("https://login.salesforce.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("haritha.gajjala15@vamritech.com");
        driver.findElement(By.id("password")).sendKeys("HarithaViswam15");
        driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r5"))).click();
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("adding multiple accounts");
        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']")));
        searchResult.click();
		
        WebElement accname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='accName']")));
        accname.click();
        accname.sendKeys("GenePoint");
	
        		
        WebElement accIndustry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='accIndustry']")));
        accIndustry.click();
        accIndustry.sendKeys("Biotechnology");
        		
        WebElement accPhone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='accPhone']")));
        accPhone.click();
        accPhone.sendKeys("(650 867-3450");
        WebElement Add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
        Add.click();
        WebElement accname3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='accName']")));
        accname3.click();
        accname3.sendKeys("GenePoint");
        WebElement accname1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accesskey='1' and @id='input-1108']")));
        accname1.click();
        accname1.sendKeys("haritha123");
        WebElement accIndustry1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='input-1109']")));
        accIndustry1.click();
        accIndustry1.sendKeys("Food & Beverage");
        WebElement accPhone1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='input-1110']")));
        accPhone1.click();
        accPhone1.sendKeys("(810) 581-1650");
        WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Delete']")));
        deleteButton.click();
        WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
        Save.click();
	
	
}


	}


