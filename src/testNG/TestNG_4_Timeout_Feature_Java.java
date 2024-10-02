package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_Timeout_Feature_Java {
	WebDriver driver;

	@Test(enabled=false)
	public void googleSelenium() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[normalize-space()='Images']")).click();
	}
	@Test
	public void googlefacebook() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("images");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='FMKtTb UqcIvb'][normalize-space()='Images']")).click();
		
	
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
