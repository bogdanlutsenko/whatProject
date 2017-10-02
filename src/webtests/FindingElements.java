package webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bogdanlutsenko/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		//go to page and find an element that has an ID - twotabsearchtextbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wooden spoon");
		                           // WHERE                           //WHAT
		
		driver.findElement(By.className("nav-input")).click();
		
		String title=driver.getTitle();
		if(title.contains("wooden spoon")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
			driver.quit();
	}

}
