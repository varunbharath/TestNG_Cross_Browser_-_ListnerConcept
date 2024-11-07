package demo_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterClass;

public class Class_classNewTest {
	// set the proirity
	
//  @Test(retryAnalyzer = Analyzer.class)
  public void Insta() { 
	  System.out.println("launch the Insta URL");
  }
  @Test(priority = 3)
  public void Instalogin_username() {
	  System.out.println("enter Insta username");
  }
  @Test(priority = 2)
  public void Insta_password() {
	  System.out.println("enter Insta password");
  }
  @Test(priority = 0)
  public void Instacapcha() {
	  System.out.println("enter insta capcha");
	  
  }
  @Test(enabled = false)
  public void Instaloginbutton() {
	  System.out.println("Insta login successfull");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am before class" );
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am after class" );
  }

}
