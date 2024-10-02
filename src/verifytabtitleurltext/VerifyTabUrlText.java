package verifytabtitleurltext;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyTabUrlText {
	WebDriver driver;
  @Test
  public void tabtile() {
	  driver.get("https://www.Google.com/");
	  
	  String exptabletitle = "Google";
	  System.out.println("ExpectedTab Title:"+exptabletitle);
	  
	  String actabtitle = driver.getTitle();
	  System.out.println("ActualTab title:"+actabtitle);
	  
	  Assert.assertEquals(actabtitle, exptabletitle);
	  
  }
  @Test
  public void verifyapplicationURL() {
	  driver.get("https://www.google.com/");
	  
	  String expurl = "https://www.google.com/";
		 
		 String acturl = driver.getCurrentUrl();
		 
		 Assert.assertEquals(acturl, expurl);
	  
  }
  @Test
  public void verifyapplicationText() {
	  driver.get("https://www.google.com/");
	  
	  String expgmail = "Gmail";
		 
		  String actgmail = driver.findElement(By.xpath("//*[@aria-label=\"Gmail (opens a new tab)\"]")).getText();
		 
		Assert.assertEquals(actgmail,expgmail);
	  
  }
  @Test
  public void verifyapplicationtext() {
	  driver.get("https://www.google.com");
	  
	 String expgmail = "Gmail";
	 
	 String actgmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
	 
	 Assert.assertEquals(actgmail, expgmail);
	 
     String expimg = "Images";
	 
	 String actimg = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();
	 
	 Assert.assertEquals(actimg, expimg);
  }
	 
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
