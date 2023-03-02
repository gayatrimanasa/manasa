package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class driverfacotry {
  @Test
  public void f() {
  }
  public WebDriver driver;
  
  @BeforeTest
  public void startUp() 
  {
	  System.setProperty("webdriver.chromedriver", "E://Selenium software//BrowserDriver(109)//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://google.com");
  }

  @AfterTest
  public void shutDown()
  {
	  //driver.colse();
  }
}
