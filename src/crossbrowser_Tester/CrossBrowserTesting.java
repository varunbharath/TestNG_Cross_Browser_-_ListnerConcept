package crossbrowser_Tester;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import org.testng.annotations.AfterClass;
import org.testng.Reporter;

public class CrossBrowserTesting {
	WebDriver driver;

  @Test
  public void A() {
		driver.get("https://www.mycontactform.com/samples.php");
		//Reporter.info("Browser is Passed @ chrome");
		Reporter.log("Browser is Passed @ chrome");
		
  }
  @Test
  public void B() {
		//driver.get("https://www.mycontactform.com/samples.php");
	  Reporter.log("Browser is Passed @ edge");
  }
  @Test
  public void C() {
	  
  }
  @Test
  public void D() {
	  
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	//  Object browser;
	if(browser.equals("chrome"))
		
	{
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		 // System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		  driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
	}
  else if(browser.equals("firefox"))

  {

 // driver=new FirefoxDriver();
	  driver= new EdgeDriver();
	 // driver= new FirefoxDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\EdgeDriver\\edgedriver_win64 (1)\\msedgedriver.exe");

  }
  else {
	//  System.out.println("Browser is notmatched");
  
	
  }
  
  }
  @AfterClass
  public void afterClass() {
	  
  }

}
