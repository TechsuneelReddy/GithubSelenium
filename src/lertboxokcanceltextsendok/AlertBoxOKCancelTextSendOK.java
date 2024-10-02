package lertboxokcanceltextsendok;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertBoxOKCancelTextSendOK {
	WebDriver driver ;
	
	

/*@Test(enabled=false)
  public void alertokbutton() throws InterruptedException {
	  
	 
			driver.get("https://seleniumlearn.com/confirmation-dialog-box");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept();
		}
 @Test
 public void alertCancelbutton()throws InterruptedException 
 {
	 driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\\\"node-102\\\"]/div/div[1]/div/div/button")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().dismiss();
	 
	
	 
	 
	 
 }*/
 @Test
 public void alertsendtextOkbutton()throws InterruptedException 
 {
	 driver.get("https://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().sendKeys("suneel");
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
		Alert alrt = driver.switchTo().alert();
		
	alrt.sendKeys("suneel");
	alrt.accept();
		
	 
	 
	 
 }
 


	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	
  }

}
