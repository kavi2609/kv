package t2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.ArrayList;
public class test3 {
	@Test(groups="two")
	public void m3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.getWindowHandle();
		ArrayList<String> ob= new ArrayList<String>(n.getWindowHandles());
		
//		n.findElementByCssSelector("#APjFqb").sendKeys("claysys");
//		
//		n.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]").click();
//		n.quit();
	}

}
