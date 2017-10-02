package webtests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bogdanlutsenko/Documents/Libraries/drivers/chromedriver");
  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		///sdjdh
		Thread.sleep(2000);
		
		driver.navigate().to("http://amazon.com");
		
		Thread.sleep(2000);
		
		driver.get("http:www.etsy.com");
		// refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		// Navigate back
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		
		//close
		
		driver.quit();
		
		

		
		
		
		
		
		
	}

}
