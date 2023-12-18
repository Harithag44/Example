package com.vamritech.testcases;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
										
		     
	        String baseUrl = "https://demo.guru99.com/test/social-icon.html";
	        System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();					
	        driver.get(baseUrl);					
	        String expectedTooltip = "Google+";
	        WebElement g = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[2]"));
	        Thread.sleep(2000);
	        String actualTooltip = g.getAttribute("title");	
	        System.out.println("Actual Title of Tool Tip:"+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
	        driver.close();			
	   }		
			
	}


