package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingAnnotation1 extends driverfacotry {
	 @Test
	  public void search() {
		  driver.findElement(By.name("q")).sendKeys("Selenium WebDeriver");
		 Actions a = new Actions(driver);
		  a.sendKeys(Keys.ENTER).perform();
	  }
  }


