package com.vamritech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

		//WebDriver driver = null;
		driver.get("https://www.facebook.com/reg/?next=%2Finstagram%2F");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //driver.findElement(By.id("u_0_b_N4")).sendKeys("Haritha");
       driver.findElement(By.className("_8esa")).click();
	}

}
