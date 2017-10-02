package webtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageActions {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/bogdanlutsenko/Documents/Libraries/drivers/chromedriver");
	  
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	String title=driver.getTitle();  // GETTITLE
	System.out.println(title);
	
	if(title.equals(expectedTitle)){
		System.out.println("Step passed. ");
	}else{
		System.out.println("Step failed");
		System.out.println("Expected: "+ expectedTitle);
		System.out.println("Actual; "+title);
	}
	System.out.println("URL "+ driver.getCurrentUrl());
	
	driver.get("http:www.etsy.com");
	System.out.println(driver.getTitle());
	
	//***GETCURRENTURL****
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.navigate().to("https://www.etsy.com/search?q=wooden%20spoon&ref=auto1");
	System.out.println(driver.getCurrentUrl());
	
	
	//**GETPAGESOURCE******
	
	driver.get("http://www.hotwire.com");
    String html=driver.getPageSource();
    System.out.println("Length"+ html.length());
    
    System.out.println(html.substring(0,100));
    
    
    driver.get("http://www.ebay.com");
    html=driver.getPageSource();
    if(html.contains("Popular Destinations")){
    	System.out.println("Popular Destinations is present");
    }else{
    	System.out.println("Not present");
    }
    
    
	
    driver.quit();
	
	
	
	
}
}
