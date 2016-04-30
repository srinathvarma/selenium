package myprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Facebook {
	private WebDriver driver;
	public String baseurl;
	
  @Test
  public void Firstname() {
	  driver.findElement(By.id("u_0_1")).sendKeys("srinath");
	  driver.findElement(By.id("u_0_1")).sendKeys(Keys.TAB);
	  
  }
	

@BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baseurl = "https://www.facebook.com/?_rdr";
	  driver.get(baseurl);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
