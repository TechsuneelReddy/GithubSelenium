package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_Discription {
	WebDriver driver;

	@Test(description="Logo module")
	public void dm2() {
		
		driver.findElement(By.xpath("//img[@alt='Logo']")).click();
		
	}

	@Test(description="menu module")
	public void dm3() {
		
		driver.findElement(By.xpath("//*[@data-testid=\"headerArticlesMenuButton\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"navigation-item-link\"]")).click();
		
	}
	@Test(description="search functionality")
	public void dm14() {
		
		driver.findElement(By.xpath("//*[@id=\"__BVID__19\"]")).sendKeys("selenium");
		
	}
	@Test(description="Verify the Login Module")
	public void dm15() {
		
		driver.findElement(By.xpath("//a[@class='auth-button custom-button custom-button--black']")).click();
		
	}
	

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://www.dummies.com/");
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
