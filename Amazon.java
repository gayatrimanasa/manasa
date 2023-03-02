package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
	  @Test
	  public void asearch() 
	  {
		  
		  System.setProperty("webdriver.Chrome.driver", "E://Selenium Software //BrowserDriver109//ChromeDriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.com");
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  Reporter.log("Amazon product Search test is Succesful...",true);

}
}