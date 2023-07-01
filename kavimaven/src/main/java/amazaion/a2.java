package amazaion;

import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://letcode.in/frame");
		n.switchTo().frame(0);
		n.findElementByName("fname").sendKeys("kavi");
		

	}

}
