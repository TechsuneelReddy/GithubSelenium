package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_GroupsTesting {
	WebDriver driver;
	
  @Test(groups="Social")
  public void twitter() throws InterruptedException {
	  driver.get("https://twitter.com/");
	  Thread.sleep(2000);
	 
  }
  @Test
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
  }
  @Test(groups="food")
  public void swiggy() throws InterruptedException {
	  driver.get("https://www.swiggy.com/");
	  Thread.sleep(2000);
	 
  }
  @Test(groups="food")
  public void zomato() throws InterruptedException {
	  driver.get("https://www.zomato.com/");
	  Thread.sleep(2000);
  }
  @Test(groups="Social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
	  
	 
  }
 
  @BeforeTest(groups="food")
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
