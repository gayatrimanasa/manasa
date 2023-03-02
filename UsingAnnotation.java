package testNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UsingAnnotation extends driverfacotry

{
	  @Test
	  public void getEmail() 
	  {
		  driver.findElement(By.linkText("Gmail")).click();
	  }
}
