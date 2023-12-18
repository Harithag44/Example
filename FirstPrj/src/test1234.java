import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1234 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\harit\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
	    //WebDriver driver = new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
	    //wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
		.sendKeys("haritha.gajjala@vamritech.com.remsdev4");
Thread.sleep(2000);        
driver.findElement(By.id("password")).sendKeys("Haritha@44");
        driver.findElement(By.id("Login")).click();
        driver.manage().window().maximize();
        Thread.sleep(8000);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("slds-r8"))).click();
        Thread.sleep(4000);
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")));
        searchInput.sendKeys("Products");
        Thread.sleep(4000);
        WebElement searchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'Product2')]//*[@class='slds-truncate']")));
        searchResult.click();
        Thread.sleep(4000);
        WebElement New = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='New']")));
        New.click();
        Thread.sleep(4000);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type=\"text\"]"))).sendKeys("mac XS");
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type=\"text\"]"));

      /* WebElement pt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"check-button-label-58-1396\"]")));
       JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
       jsExecutor.executeScript("arguments[0].scrollIntoView(true);", pt);
       pt.click();*/
        
      // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"127:4014;a\"]"))).click();
       
      // driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']"))).click();
        
        
      //  WebElement formElement = driver.findElement(By.tagName("input"));
       // List<WebElement> allFormChildElements = driver.findElements(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div[1]/div/article/div[3]/div/div"));
      //  for (WebElement item : allFormChildElements)
       // {
           // System.out.println("Tag:" + item.getAttribute("type"));
        
     // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*@imaxlength=\"255"))).sendKeys("xen 12");
      driver.findElement(By.xpath("//*[@class='uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select']//*[text()='USD - U.S. Dollar']")).click();
//driver.findElement(by.xpath("//*[@class=\"globalCreateTrigger slds-button slds-button_icon slds-button_icon slds-button_icon-container slds-button_icon-small slds-global-actions__task slds-global-actions__item-action\"]"]"));
	//driver.findElement(By.className("globalCreateTrigger slds-button slds-button_icon slds-button_icon slds-button_icon-container slds-button_icon-small slds-global-actions__task slds-global-actions__item-action"));
	WebElement Save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Save']")));
    Save.click();
   /* WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tab-value='relatedListsTab' and @data-label='Related']")));
    relatedTab.click();
    Thread.sleep(6000);*/
     //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-controls=\"3807:0\"]"))).click();
     WebElement relatedTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tab-value='relatedListsTab' and @data-label='Related']"))); relatedTab.click();
    
    
    

	}
}

	

		