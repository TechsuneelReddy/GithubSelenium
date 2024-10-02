package seleniumlocators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locatorspart1 {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
    @Disabled
	@Test
	void test() throws InterruptedException {
		
		driver.get("https://seleniumlearn.com/user");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Suneel reddy");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("test@123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Kumar");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("form-submit")).click();
		
	}
    
    @Test
	void Locators2() throws InterruptedException {
		
		driver.get("https://seleniumlearn.com/user");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Suneel reddy");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("test@123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Kumar");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("form-submit")).click();
		
	}

}
