package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
	//driver = new ChromeDriver();
	
	//driver = new EdgeDriver();
	
	driver = new FirefoxDriver();
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	//driver.close();
	
	driver.quit();
	
	
	
	}
}