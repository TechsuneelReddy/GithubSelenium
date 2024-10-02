package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jdemo {
WebDriver driver;
	
  @Test
  public void googlesearch() throws InterruptedException {
	  
	  Logger log= Logger.getLogger("Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  
	  driver = new ChromeDriver();
	  
	  log.info("Chrome Browser Luanched");
	  
	  driver.manage().window().maximize();
	  
	  log.info("Browser Maximized");
	  
	  driver.get("https://www.google.com/");
	  
	  log.info("Navigated to Google");
	  
	  driver.findElement(By.name("q")).sendKeys("Tirupati");
	  
	  log.info("In google search field Tiruapti text enter");
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
	  log.info("In search  keys will enter Tirupati");
	  
	  Thread.sleep(2000);
	  
	  log.info("Wait for 2 seconds ");
  }
}
