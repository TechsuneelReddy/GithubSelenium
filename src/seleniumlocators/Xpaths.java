package seleniumlocators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Xpaths {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

	@Test
	void test() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("Suneelreddy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@maxlength=\"128\"]")).sendKeys("Hello123@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();		
		
		
		
	}

}
