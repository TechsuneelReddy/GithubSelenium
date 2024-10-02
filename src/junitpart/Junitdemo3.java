package junitpart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitdemo3 {
	
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.quit();
		
	}

	@Test
	void google1() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		
	}
	
	@Test
	void Facebook2() throws InterruptedException {
		
		driver.get("https://www.Facebook.com/");
		Thread.sleep(4000);
		
	}
	
	@Test
	void redmine3() throws InterruptedException {
		
		driver.get("https://www.redmine.org");
		Thread.sleep(4000);
		
	}
	@Test
	void selenium4() throws InterruptedException {
		
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		
	}
	@Test
	void twitter5() throws InterruptedException {
		
		driver.get("https://www.twitter.com");
		Thread.sleep(4000);
		
	}
	

}
