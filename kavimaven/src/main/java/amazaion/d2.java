package amazaion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
public class d2 {
	
	@Test
	public void main() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeDriver n= new ChromeDriver();
			n.get("https://www.facebook.com");
			
			WebElement d1 = n.findElementByName("login");
			
			Actions n1 = new Actions(n);
//			n1.click(d1).build().perform();
//			n1.doubleClick(d1).build().perform();
	//		n1.contextClick(d1).build().perform();
	//		n1.moveToElement(d1).build().perform();
			
			n1.clickAndHold(d1).build().perform();
			Thread.sleep(4000);
			n1.release(d1).build().perform();
			
			
			
	}

}
