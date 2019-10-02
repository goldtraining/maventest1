import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myclass {
	
	
  @Test
  public void test1() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  driver.quit();
  }
	  
	  @Test
	  public void test2() throws InterruptedException {
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://google.com");
		  Thread.sleep(3000);
		  Assert.assertEquals(1, 2);
		  driver.quit();
		  
		  
	  
	  
  }
}
