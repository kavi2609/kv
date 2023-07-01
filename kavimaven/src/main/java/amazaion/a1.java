package amazaion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class a1 {
	
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.amazon.com");
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		n.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		n.findElementById("nav-search-submit-button").click();
		n.findElementByXPath("//*[@id=\"p_n_feature_nine_browse-bin/23732468011\"]/span/div/label/i").click();
		Thread.sleep(4000);
	     Shutterbug.shootPage(n, Capture.FULL, true).save("C:\\Users\\Admin\\Desktop\\selenium\\");
	     Thread.sleep(3000);
	     n.navigate().back();
	     n.quit();
	}

}
