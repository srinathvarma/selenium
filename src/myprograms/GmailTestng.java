package myprograms;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GmailTestng {
	private WebDriver driver;
	public String baseurl;
	public boolean expresult = false;
//	@Test
//	public void FNValidtext()
//	{ 
//	driver.findElement(By.id("FirstName")).sendKeys("Madhu");
//	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
//	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
//	assertEquals(expresult,result);
//	}
	
	@Test
	public void FNInvalidtext()
	{ 
		driver.get(baseurl);
    expresult = true;
	driver.findElement(By.id("FirstName")).sendKeys("");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
	assertEquals(expresult,result);
	}
	
	@Test
	public void LNInvalidtext()
	{ 
		driver.get(baseurl);
    expresult = true;
	driver.findElement(By.id("FirstName")).sendKeys("");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
	assertEquals(expresult,result);
	}
	
	@Test
	public void LNValidnumber()
	{
		driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("LastName")).sendKeys("11222222");
	driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   
	   @Test
	public void LNValidAlphanumeric()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("LastName")).sendKeys("112asdfa22222");
	driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   @Test

	public void LNValidSpecial()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("LastName")).sendKeys("@#$@#$@%$@");
	driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   
	   @Test
	public void LNblank()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("LastName")).sendKeys("");
	driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
	String error = driver.findElement(By.id("errormsg_0_LastName")).getText();
	System.out.println(error);
	assertEquals("You can't leave this empty.",error);
	}
	//First Name test
	@Test
	public void FNValidtext()
	{
		driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("FirstName")).sendKeys("Madhu");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   @Test
	public void FNValidnumber()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("FirstName")).sendKeys("11222222");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   @Test
	public void FNValidAlphanumeric()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("FirstName")).sendKeys("112asdfa22222");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   @Test

	public void FNValidSpecial()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.id("FirstName")).sendKeys("@#$@#$@%$@");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
	assertEquals(expresult,result);
	}
	   
	   @Test
	public void FNblank()
	{
		   driver.get(baseurl);
	System.out.println("This is test"); 
	driver.findElement(By.className("firstname")).sendKeys("");
	driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	String error = driver.findElement(By.id("errormsg_0_FirstName")).getText();
	System.out.println(error);
	assertEquals("You can't leave this empty.",error);
	}
	   @Test
	   
	   public void Birthmonth(){
		   driver.get(baseurl);
	 driver.findElement(By.id("BirthMonth")).sendKeys("February");  
	 
	   
	   }


  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  baseurl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
 
  public void afterTest() {
	  driver.quit();
  }
  

}
