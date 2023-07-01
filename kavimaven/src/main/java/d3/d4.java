package d3;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class d4 {
	
	
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver  n= new ChromeDriver();
		n.get("https://www.google.com");
		
	 for(int i =0; i<=5;i++)
	 {
		 n.navigate().refresh();
	 }
		
		

	}

}
