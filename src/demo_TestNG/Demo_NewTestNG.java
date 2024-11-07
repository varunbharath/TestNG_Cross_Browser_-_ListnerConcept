package demo_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo_NewTestNG {
  @Test 
  public void f() {
	  System.out.println("login scenario");
  }
  @Test 
  public void B() {
	  System.out.println("login scenario B");
  }
  @Test 
  public void A() {
	  System.out.println("login scenario A");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Iam After method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Iam After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Iam before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Iam After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Iam Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Iam Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Iam After suite");
  }

}
