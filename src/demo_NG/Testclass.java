package demo_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testclass {
	//dependencies
	 @Test (priority = 0)
	  public void facebookloginurl() {
		  System.out.println("launch the fb url");
	  }
	 // @Test(dependsOnMethods = {"facebookloginurl"})
	 @Test(enabled = true)
	  public void FBlogin_username() {
		  System.out.println("enter FB username");
	  }
	  @Test (dependsOnMethods = "FBlogin_username")
	  public void FB_password() {
		  System.out.println("enter Facebook password");
	  }
	  @Test
	  public void facebookcapcha() {
		  System.out.println("enterfacebook capcha");
	  }
	  @Test(priority = 4)
	  public void facebookloginbutton() {
		  System.out.println("fb login successfull");
	  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam AFter test");
  }

}
