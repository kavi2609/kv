package project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook {
	
	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.findElement(By.name("q")).sendKeys("filpkart",Keys.ENTER);
		
//		n.findElementByXPath("/html/body/div[6]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3").click();
//		n.findElementByXPath("/html/body/div[2]/div/div/button").click();
//		n.findElementByName("q").sendKeys("iphone");
//		
//    	n.findElementByCssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button > svg").click();
//		
//		n.findElementByXPath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]").click();
	}

}
