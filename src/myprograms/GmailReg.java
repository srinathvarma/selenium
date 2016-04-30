package myprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GmailReg {
	private WebDriver driver;
	public String baseurl; 
  @Test
  public void f() {
	  driver.get(baseurl);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baseurl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
