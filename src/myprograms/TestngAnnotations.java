package myprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngAnnotations {
  @Test
  public void f() {
System.out.println("we are inside   test 1 annotation");

  }
  
 
  @Test
  public void g() {
System.out.println("we are inside test 2 annotation");
  }
  
  
  
  @Test
  public void h() {
System.out.println("we are inside test 3 annotation");
  }
  
 
  @Test
  public void f5() {
System.out.println("we are inside test 4 annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("we are inside before method annotation"); 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("we are inside after method annotation"); 
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("we are inside before class  annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("we are inside after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("we are inside beforetest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("we are inside after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("we are inside before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("we are inside after suite annotation");
  }

}
