package active_element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		//n.get("https://www.google.com");
		
		
		n.get("https://www.facebook.com");
		
		WebElement a1 = n.switchTo().activeElement();
		
		a1.sendKeys("6380606117",Keys.TAB,"kavi2426",Keys.ENTER);

	}

}
