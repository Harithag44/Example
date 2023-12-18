package com.vamritech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.createProperties("\"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
	    

		driver.get("https://login.salesforce.com/");
		
		Thread.sleep(5000);

		driver.findElement(By.name("rememberUn")).click();
		

	}

}
