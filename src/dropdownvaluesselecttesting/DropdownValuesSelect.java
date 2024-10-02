package dropdownvaluesselecttesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropdownValuesSelect {
	static WebDriver driver;
  @Test
  public void selectdropdownoptions() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(3000);
	  
	  
	  //new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(5);
	  
	  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("AF");
	  
	 //new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("India");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517569");
	 Thread.sleep(3000);
  }
  @Test
  public void selectdropdownoptionsgoogle () throws InterruptedException {
	  
	  driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//select[@id='first']")).click();
	  Thread.sleep(5000);
	  new Select(driver.findElement(By.xpath("//select[@id='first']"))).selectByValue("Google");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//*[@id=\"animals\"]")).click();
	  Thread.sleep(5000);
	  new Select(driver.findElement(By.xpath("//*[@id=\"animals\"]"))).selectByVisibleText("Avatar");
	  Thread.sleep(5000);
	  
	  
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
