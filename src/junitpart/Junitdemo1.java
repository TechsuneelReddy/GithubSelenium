package junitpart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitdemo1 {
	
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
	void test1() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		
	}
	
	@Test
	void test2() throws InterruptedException {
		
		driver.get("https://www.Facebook.com/");
		Thread.sleep(4000);
		
	}
	
	@Test
	void test3() throws InterruptedException {
		
		driver.get("https://www.redmine.org");
		Thread.sleep(4000);
		
	}
	@Test
	void test4() throws InterruptedException {
		
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		
	}
	@Test
	void test5() throws InterruptedException {
		
		driver.get("https://www.twitter.com");
		Thread.sleep(4000);
		
	}
	

}
