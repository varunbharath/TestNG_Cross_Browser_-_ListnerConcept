package demo_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Method_NewClass_Demo {
	// skip the particular testcase
  @Test(enabled = false)
  public void Amazonloginurl() {
	  System.out.println("launch the  Amazon url");
	  
  }
  @Test (invocationCount = 3,invocationTimeOut = 3,threadPoolSize = 2)
  public void Amazonloginusername() {
	  System.out.println("enter the  Amazonusername");
	  
  }
  @Test
  public void Amazonloginpassword() {
	  System.out.println("enter the Amazon  password");
	  
  }
  @Test(enabled = false)
  public void Amazonloginbutton() {
	  System.out.println("Valid login buttonS clicked successfully");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im After Method");
  }

}
