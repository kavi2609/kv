package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	@Test(groups="one")
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.findElementByLinkText("Images").click();
		
		Thread.sleep(2000);
		
		n.navigate().back();
		
		Thread.sleep(2000);
		
		n.navigate().forward();
		
		Thread.sleep(2000);
		
		n.quit();
	}

}
