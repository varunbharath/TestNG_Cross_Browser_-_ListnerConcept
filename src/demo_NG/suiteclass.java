package demo_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class suiteclass {
  @Test(groups = "smoke")
  
  public void AmazonPrimelogin_username() {
	  System.out.println("enter prime username");
  }
  @Test (groups = "smoke")
  public void AmazonPrimelogin_password() {
	  System.out.println("enter prime password");
  }
  @Test(groups = "retest")
  public void AmazonPrimelogin_entercapcha() {
	  System.out.println("enter prime capcha");
  }
  @Test(groups = "retest")
  public void AmazonPrimeloginbutton() {
	  System.out.println("Prime login successfull");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm before suie");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm after suite");
  }

}
