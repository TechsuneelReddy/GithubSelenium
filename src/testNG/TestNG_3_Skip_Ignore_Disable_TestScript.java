package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_Skip_Ignore_Disable_TestScript {
	WebDriver driver;
	
  @Test(priority=0,enabled=false)
  public void twitter() throws InterruptedException {
	  driver.get("https://twitter.com/");
	  Thread.sleep(2000);
	 
  }
  @Test(priority=1)
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void sleniumdev() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(2000);
	 
  }
  @Test(timeOut=7000,enabled=true)
  public void techlearn() throws InterruptedException {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(2000);
  }
  @Test(priority=4)
  public void facebook() {
	  driver.get("https://www.facebook.com");
	  
	 
  }
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
