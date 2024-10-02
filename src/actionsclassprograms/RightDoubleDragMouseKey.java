package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightDoubleDragMouseKey {
	
	WebDriver driver;
	
  @Test
  public void rightclick() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/");
	  Thread.sleep(5000);
	  
	  Actions act = new Actions(driver);
	  
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-386-1\"]/a"))).build().perform();  
  }
	
  @Test
  public void doubleclickonwebElement() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/double-click");
	  Thread.sleep(5000);
	  
	  Actions act = new Actions(driver);
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();	  
  }
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(5000);
	  
	Actions actn = new Actions(driver);
	
	
	WebElement source = driver.findElement(By.id("draggable"));
	Thread.sleep(5000);
	WebElement target = driver.findElement(By.id("droppable"));
	Thread.sleep(5000);
	actn.dragAndDrop(source,target).build().perform();
	Thread.sleep(5000);
  }
  @Test
  public void mousehover() throws InterruptedException {
	  driver.get("https://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(5000);
	  
	  Actions actn = new Actions(driver);
	  actn.moveToElement(driver.findElement(By.xpath("//*[@class=\"sf-depth-1 menuparent sf-with-ul\"]"))).build().perform();
	  Thread.sleep(3000);
	  actn.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().build().perform();	
  }
  
  @Test
  public void keyboardkeys() throws InterruptedException {
	  driver.get("https://redmine.org/");
	  Thread.sleep(5000);
	  driver.findElement(By.className("login")).click();
	  
	  Actions actn = new Actions(driver);
	  Thread.sleep(2000);
	  actn.sendKeys(Keys.TAB).build().perform();	
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
