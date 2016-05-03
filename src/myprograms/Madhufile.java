package myprograms;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Madhufile {
private WebDriver driver;
public String Baseurl;
public boolean expresult = false;
@Before
public void before()
{
driver = new FirefoxDriver();
Baseurl = "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier";
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("This is before");
driver.get(Baseurl);
driver.findElement(By.linkText("Create account")).click();

}
//@Test
//public void LNValidtext(String locator, String value)
//{
//System.out.println("This is test"); 
//driver.findElement(By.id("LastName")).sendKeys("Madhu");
//driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
//boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
//assertEquals(expresult,result);
//}
   @Test
public void LNValidnumber()
{
System.out.println("This is test"); 
driver.findElement(By.id("LastName")).sendKeys("11222222");
driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
assertEquals(expresult,result);
}
   
   @Test
public void LNValidAlphanumeric()
{
System.out.println("This is test"); 
driver.findElement(By.id("LastName")).sendKeys("112asdfa22222");
driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
assertEquals(expresult,result);
}
   @Test

public void LNValidSpecial()
{
System.out.println("This is test"); 
driver.findElement(By.id("LastName")).sendKeys("@#$@#$@%$@");
driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
assertEquals(expresult,result);
}
   
   @Test
public void LNblank()
{
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
System.out.println("This is test"); 
driver.findElement(By.id("FirstName")).sendKeys("Madhu");
driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
assertEquals(expresult,result);
}
   @Test
public void FNValidnumber()
{
System.out.println("This is a new selenium test"); 
driver.findElement(By.id("FirstName")).sendKeys("11222222");
driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
assertEquals(expresult,result);
}
   @Test
public void FNValidAlphanumeric()
{
System.out.println("This is test"); 
driver.findElement(By.id("FirstName")).sendKeys("112asdfa22222");
driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
assertEquals(expresult,result);
}
   @Test

public void FNValidSpecial()
{
System.out.println("This is test"); 
driver.findElement(By.id("FirstName")).sendKeys("@#$@#$@%$@");
driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
boolean  result  = driver.findElement(By.id("errormsg_0_FirstName")).isDisplayed();
assertEquals(expresult,result);
}
   
   @Test
public void FNblank()
{
System.out.println("This is test"); 
driver.findElement(By.className("firstname")).sendKeys("");
driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
String error = driver.findElement(By.id("errormsg_0_FirstName")).getText();
System.out.println(error);
assertEquals("You can't leave this empty.",error);
}
   @Test
   
   public void Birthmonth(){
   
 driver.findElement(By.id("BirthMonth")).sendKeys("February");  
   
   }
   
@Test
   
   public void country(){
   
 driver.findElement(By.cssSelector(".goog-inline-block.i18n-phone-select-country.i18n-phone-select-country-hover")).click();
   
   }

@After
public void aftermethod()
{
System.out.println("This is after"); 
     driver.quit();
}

}


