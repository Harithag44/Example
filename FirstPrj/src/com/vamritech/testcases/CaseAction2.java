package com.vamritech.testcases;

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

public class CaseAction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\harit\\OneDrive\\Desktop\\Haritha\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
			driver.get("https://login.salesforce.com/");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("username")))
					.sendKeys("haritha.gajjala15@vamritech.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("HarithaViswam15");
			Thread.sleep(2000);

			driver.findElement(By.id("Login")).click();
			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.findElement(By.className("slds-r7")).click();
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search apps and items')]")))
					.sendKeys("Case");
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//*[contains(@id,'al-menu-dropdown-items')]//*[@class='slds-truncate']"))).click();

			Thread.sleep(5000);
			// identify table
			WebElement mytable = driver.findElement(By.xpath("//*[@data-aura-class='uiVirtualDataTable']/tbody"));
			// identify rows of table.
			List<WebElement> r_table = mytable.findElements(By.tagName("tr"));

			int rows = r_table.size();

			System.out.print("List Rows Length:" + rows + "\n");
			int close_count = 1;
			for (int i = 0; i < rows; i++) {
				// count columns with size() method
				List<WebElement> row_cols = r_table.get(i).findElements(By.tagName("td"));
				List<WebElement> row_cols_th = r_table.get(i).findElements(By.tagName("th"));
				WebElement row_tag_a = row_cols_th.get(0).findElement(By.tagName("a"));
				int columns = row_cols.size();

				String status_col = row_cols.get(3).getText().trim();
				if (status_col.equals("New")) {
					highlight(driver, row_cols.get(3), "yellow");
					System.out.print("Case: " + row_cols_th.get(0).getText() + " - Status: " + status_col + "\n");
					System.out.println("Clicking on the Case: " + row_tag_a.getText());
					highlight(driver, row_tag_a, "#90EE90");
					Thread.sleep(1000);
					row_tag_a.click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions
							.elementToBeClickable(By.xpath("//button[@data-value='Waiting for the customer']")))
							.click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-value='In progress']")))
							.click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-value='Solved']")))
							.click();
					Thread.sleep(2000);

					driver.navigate().back();

					System.out.println("After Return Index:" + i);
					 Thread.sleep(2000);
				} else if (status_col.equals("Closed")) {
					highlight(driver, row_cols.get(3), "yellow");
					if (close_count == 1) {
						System.out.println("Clicking on the Case: " + row_tag_a.getText());
						highlight(driver, row_tag_a, "#90EE90");
						 Thread.sleep(1000);
						 row_tag_a.click();
						Thread.sleep(2000);
						driver.navigate().back();
						Thread.sleep(2000);
						close_count++;
					}

				} else {
					System.out.print("Skipping Remaining Case: " + row_cols_th.get(0).getText() + " Status: "
							+ status_col + "\n");
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void highlight(WebDriver driver, WebElement element, String color) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript(
				"arguments[0].setAttribute('style', 'background: " + color + "; border: 2px solid red;');", element);
	}

}
