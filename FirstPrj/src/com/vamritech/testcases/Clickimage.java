package com.vamritech.testcases;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class Clickimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
        		
       /* driver.get(baseUrl);	
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/a")).click();			
        if (driver.getTitle().equals("Facebook - log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
				driver.close();	*/
        driver.get("https://demo.automationtesting.in/");
        //  clicking on image
        driver.findElement(By.id("enterimg")).click();
        driver.findElement(By.xpath("//img[@alt='image not displaying']")).click();

    }		

}


